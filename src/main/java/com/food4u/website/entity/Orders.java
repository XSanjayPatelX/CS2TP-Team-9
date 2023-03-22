package com.food4u.website.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orders")
public class Orders {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false, name="order_item_id")
    private int orderItemId;

    @Column(nullable=false, name="user_id")
    private int userId;

    @Column(nullable=false, name="order_date")
    private Date orderDate;

    @Column(nullable=false, name="estimated_delivery")
    private Date estimatedDelivery;

    @Column(nullable=false, name="is_delivered")
    private String isDelivered;
}
