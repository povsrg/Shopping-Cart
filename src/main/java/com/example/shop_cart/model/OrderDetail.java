package com.example.shop_cart.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object that represents OrderDetail.
 */

@Entity
@Table(name = "orderDetail")
@Getter
@Setter
@ToString
public class OrderDetail extends BaseEntity{

    @Column(name="price")
    private Integer price;

    @Column(name="quantity")
    private Integer quantity;

    @JoinColumn(name = "order_id", updatable = false)
    private Order order;

    @JoinColumn(name = "customer_id", updatable = false)
    private Customer customer;

    public Long getOrderId() {
        return order.getId();
    }

    public Long getCustomerId() {
        return customer.getId();
    }
}
