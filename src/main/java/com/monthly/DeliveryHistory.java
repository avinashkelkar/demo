/**
 * DeliveryHistory.java
 * 23-Jun-2017
 * <p>
 * Copyright © FirstFuel Software. 2010-2017 All right reserved. The copyright to
 * the computer program(s) herein is the property of FirstFuel Software. The
 * program(s) may be used and/or copied only with the written permission of
 * FirstFuel Software.
 * </p>
 */
package com.monthly;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p> DeliveryHistory
 * </p>
 * @version 1.0
 * @author Avinash Kelkar
 * @since 23-Jun-2017
 */
@Entity
@Table(name = "delivery_history")
public class DeliveryHistory {
    
    @Id
    private String id;
    @Column(name="user_id")
    private String userId;
    @Column(name="item_id")
    private String itemId;
    @Column(name="delivery_date")
    private LocalDate deliveryDate;
    private Double quantity;
    /**
     * <p>
     * See {@link #setid(String)}
     * </p>
     * @return Returns the id.
     */
    public String getId() {
        return id;
    }
    /**
     * <p>
     * Set the value of <code>id</code>.
     * </p>
     * @param id The id to set.
     */
    public void setId( String id ) {
        this.id = id;
    }
    /**
     * <p>
     * See {@link #setuserId(String)}
     * </p>
     * @return Returns the userId.
     */
    public String getUserId() {
        return userId;
    }
    /**
     * <p>
     * Set the value of <code>userId</code>.
     * </p>
     * @param userId The userId to set.
     */
    public void setUserId( String userId ) {
        this.userId = userId;
    }
    /**
     * <p>
     * See {@link #setitemId(String)}
     * </p>
     * @return Returns the itemId.
     */
    public String getItemId() {
        return itemId;
    }
    /**
     * <p>
     * Set the value of <code>itemId</code>.
     * </p>
     * @param itemId The itemId to set.
     */
    public void setItemId( String itemId ) {
        this.itemId = itemId;
    }
    /**
     * <p>
     * See {@link #setdeliveryDate(LocalDate)}
     * </p>
     * @return Returns the deliveryDate.
     */
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
    /**
     * <p>
     * Set the value of <code>deliveryDate</code>.
     * </p>
     * @param deliveryDate The deliveryDate to set.
     */
    public void setDeliveryDate( LocalDate deliveryDate ) {
        this.deliveryDate = deliveryDate;
    }
    /**
     * <p>
     * See {@link #setquantity(Double)}
     * </p>
     * @return Returns the quantity.
     */
    public Double getQuantity() {
        return quantity;
    }
    /**
     * <p>
     * Set the value of <code>quantity</code>.
     * </p>
     * @param quantity The quantity to set.
     */
    public void setQuantity( Double quantity ) {
        this.quantity = quantity;
    }
    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DeliveryHistory [id=" + id + ", userId=" + userId + ", itemId=" + itemId + ", deliveryDate=" + deliveryDate + ", quantity=" + quantity + "]";
    }

}
