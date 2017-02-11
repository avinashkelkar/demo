package com.monthly;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by avinashk on 11/2/17.
 */
@Entity
public class Item {

    @Id
    private String id;
    private String name;
    private String unit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Item(String id, String name, String unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
    }

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
