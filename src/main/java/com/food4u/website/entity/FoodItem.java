package com.food4u.website.entity;

import com.food4u.website.repository.FoodRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="food_item")
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=true)
    private String name;

    @Column(nullable=true)
    private float price;

    @Column(nullable=true)
    private String image;

    @Column(nullable=true)
    private String description;

    @Column(nullable=true)
    private String category;

    @Column(nullable=true)
    private int stock;

    @Column(nullable=true, name="alt_text")
    private String altText;

    @Column(nullable=true, name="created_at")
    private Date createdAt;

    @Column(nullable=true, name="updated_at")
    private Date updatedAt;


}
