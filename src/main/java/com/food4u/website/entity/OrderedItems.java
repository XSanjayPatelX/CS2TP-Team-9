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
@Table(name="order_items")
public class OrderedItems {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, name="name")
    private String name;

    @Column(nullable=false, name="quantity")
    private String quantity;

    @Column(nullable=false, name="price")
    private String price;

    @Column(nullable=false, name="category")
    private String category;
}
