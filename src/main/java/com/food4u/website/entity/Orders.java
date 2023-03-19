package com.food4u.website.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer_orders")
public class Orders {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, name="order_item_id")
    private String order_item_id;

    @Column(nullable=false, name="user_id")
    private String user_id;

    @Column(nullable=false, name="order_date")
    private String order_date;

    @Column(nullable=false, name="estimated_delivery")
    private String estimated_delivery;

    @Column(nullable=false, name="is_delivered")
    private String is_delivered;
}
