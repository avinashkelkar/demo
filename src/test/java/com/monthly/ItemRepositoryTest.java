package com.monthly;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by avinashk on 11/2/17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ItemRepository items;

    @Test
    public void testFindByLastName() {
        Item item = new Item("234", "avinash","789");
        entityManager.persist(item);

        Item findByLastName = items.findByName(item.getName());

        assertThat(Collections.singletonList(findByLastName)).extracting(Item::getName).containsOnly(item.getName());
    }
}
