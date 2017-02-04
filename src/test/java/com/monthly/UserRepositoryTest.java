package com.monthly;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by avinashk on 31/1/17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository users;

    @Test
    public void testFindByLastName() {
        User user = new User("234", "avinash","789");
        entityManager.persist(user);

        User findByLastName = users.findByName(user.getName());

        assertThat(Collections.singletonList(findByLastName)).extracting(User::getName).containsOnly(user.getName());

        User byMobileNumber = users.findByMobileNumber(user.getMobileNumber());
        Assert.assertEquals( "789", byMobileNumber.getMobileNumber());

        byMobileNumber = users.findByMobNum(user.getMobileNumber());
        Assert.assertEquals( "789", byMobileNumber.getMobileNumber());
    }
}
