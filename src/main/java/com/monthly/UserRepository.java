package com.monthly;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by avinashk on 27/1/17.
 */
public interface UserRepository extends CrudRepository<User, String> {

    User findByName(String name);
}
