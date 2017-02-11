package com.monthly;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by avinashk on 27/1/17.
 */
public interface UserRepository extends JpaRepository<User, String> {

    User findByName(String name);

    User findByMobileNumber(String mobileNumber);


    User findByMobNum(String mobileNumber);
}
