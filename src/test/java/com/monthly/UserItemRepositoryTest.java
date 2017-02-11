package com.monthly;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by avinashk on 11/2/17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserItemRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private ItemRepository items;
    @Autowired
    private UserRepository users;
    @Autowired
    private UserItemRepository userItems;

    @Test
    public void findByUserName() {
        Item item = new Item("item1", "milk","litre");
        entityManager.persist(item);
        User user = new User("u1", "avinash","789");
        entityManager.persist(user);
        UserItem userItem = new UserItem("userItem1", user, item, "", true, 1.0, LocalDate.now());
        entityManager.persist(userItem);
        List<UserItem> itemsByUser = userItems.findByUser(user);
        assertThat(itemsByUser).extracting(UserItem::getItem).extracting(Item::getName).containsOnly(item.getName());
        System.out.println(itemsByUser);

        List<UserItem> userItemsByUserName = userItems.findByUserName("avinash");
        assertThat(userItemsByUserName).extracting(UserItem::getItem).extracting(Item::getName).containsOnly(item.getName());
        System.out.println(userItemsByUserName);
    }
}
