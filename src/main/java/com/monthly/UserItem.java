package com.monthly;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by avinashk on 11/2/17.
 */
@Entity
@Table(name = "user_item")
public class UserItem {
    @Id
    private String id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Item item;
    private String frequency;
    private boolean active;
    private Double quantity;
    @Column(name = "service_start_date")
    private LocalDate serviceStartDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(LocalDate serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public UserItem(String id, User user, Item item, String frequency, boolean active, Double quantity, LocalDate serviceStartDate) {
        this.id = id;
        this.user = user;
        this.item = item;
        this.frequency = frequency;
        this.active = active;
        this.quantity = quantity;
        this.serviceStartDate = serviceStartDate;
    }

    public UserItem() {
    }

    @Override
    public String toString() {
        return "UserItem{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", item=" + item +
                ", frequency='" + frequency + '\'' +
                ", active=" + active +
                ", quantity=" + quantity +
                ", serviceStartDate=" + serviceStartDate +
                '}';
    }
}
