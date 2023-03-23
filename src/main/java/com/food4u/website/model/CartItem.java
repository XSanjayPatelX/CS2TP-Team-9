package com.food4u.website.model;

import com.food4u.website.entity.FoodItem;

public class CartItem {

    private final FoodItem product;
    private int quantity;
    private double subTotal;

    public CartItem(FoodItem product) {
        this.product = product;
        this.quantity = 1;
        this.subTotal = product.getPrice();
    }

    public FoodItem getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        subTotal = product.getPrice() * quantity;
        return Math.round(subTotal * 100.0) / 100.0;
    }
}
