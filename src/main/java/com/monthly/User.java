package com.monthly;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * Created by avinashk on 27/1/17.
 */
@NamedQuery(name = "User.findByMobNum", query = "SELECT u FROM User u WHERE u.mobileNumber = ?1")
@Entity
public class User {

    @Id
    private String id;

    private String name;

    @Column(name = "mobile_number")
    private String mobileNumber;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public User(String id, String name, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
