package com.food4u.website.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Base64;

@Entity
@Table(name = "food_item")
@Data

public class Food_Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String food;
    private float price;
    private byte[] image;
    private String encodedImage;
    private String description;
    private String category;
    private int stock;

    private String altText;

    private LocalDate createdAt;
    private LocalDate updatedAt;
    public Food_Item() {
    }
    public Food_Item(int id, String food, float price, byte[] image, String description, String category, int stock, String altText, LocalDate createdAt, LocalDate updatedAt, String encodedImage) {
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
        if (image != null){
            byte[] encodeBase64 = Base64.getEncoder().encode(image);
            String base64Encoded = new String(encodeBase64, StandardCharsets.UTF_8);
            this.encodedImage = base64Encoded;
        }

        System.out.println("Image length: " + (this.image != null ? image.length : 0));

    }

    public void setImage(byte[] image){
        this.image = image;
        this.encodedImage = Base64.getEncoder().encodeToString(image);
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

    public byte[] getImage() {
        return image;
    }

    public void setTImage(byte[] image) {
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
