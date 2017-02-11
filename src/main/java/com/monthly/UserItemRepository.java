package com.monthly;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by avinashk on 11/2/17.
 */
public interface UserItemRepository extends JpaRepository<UserItem, String> {
    List<UserItem> findByUser(User user);

    List<UserItem> findByUserName(String avinash);
}
