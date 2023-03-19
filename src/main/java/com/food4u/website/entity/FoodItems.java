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
@Table(name="food_items")
public class FoodItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=true, name="price")
    private String price;

    @Column(nullable=true, name="image")
    private String image;

    @Column(nullable=true, name="description")
    private String description;

    @Column(nullable=true, name="category")
    private String category;

    @Column(nullable=true, name="stock")
    private String stock;

    @Column(nullable=true, name="alt_text")
    private String alt_text;

    @Column(nullable=true, name="created_at")
    private String created_at;

    @Column(nullable=true, name="updated_at")
    private String updated_at;

    @Column(nullable=true, name="food")
    private String food;
}
