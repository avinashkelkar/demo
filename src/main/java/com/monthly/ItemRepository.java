package com.monthly;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by avinashk on 11/2/17.
 */
public interface ItemRepository extends JpaRepository<Item, String> {
    Item findByName(String name);
}
