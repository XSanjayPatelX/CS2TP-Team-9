package com.food4u.website.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "food_item")
@Data
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String food;
    private float price;
    private String image;
    private String description;
    private String category;
    private int stock;
    private String altText;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public FoodItem() {

    }

    public FoodItem(int id, String food, float price, String image, String description, String category, int stock, String altText, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.food = food;
        this.price = price;
        this.image = image;
        this.description = description;
        this.category = category;
        this.stock = stock;
        this.altText = altText;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage(){
        return this.image;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText){
        this.altText = altText;
    }

    public LocalDate getCreated() {
        return createdAt;
    }

    public void setCreated(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt(){
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt){
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Food_Item{" +
                "id=" + id +
                ", food='" + food + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", desc='" + description + '\'' +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }
}
