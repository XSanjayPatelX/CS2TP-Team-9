package com.food4u.website.model;

import com.food4u.website.entity.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> items;
    private double total;

    public Cart() {
        items = new ArrayList<>();
        total = 0;
    }

    public CartItem getItem(FoodItem product){
        for (CartItem item : items){
            if(item.getProduct().getId() == product.getId()){
                return item;
            }
        }
        return null;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public int getItemCount(){
        return items.size();
    }

    public void addItem(CartItem item){
        addItem(item.getProduct(), item.getQuantity());
    }

    public void addItem(FoodItem product, int quantity){
        CartItem item = getItem(product);

        if (item != null){
            item.setQuantity(item.getQuantity() + quantity);
        } else {
            item = new CartItem(product);
            item.setQuantity(quantity);
            items.add(item);
        }
    }

    public void updateItem(FoodItem product, int quantity){ // throws ProductNotFoundException
        CartItem item = getItem(product);

        if (item != null){
            item.setQuantity(quantity);
        } else {
            // throw new ProductNotFoundException();
        }
    }

    public void removeItem(FoodItem product){ // throws ProductNotFoundException
        CartItem item = getItem(product);

        if (item != null){
            items.remove(item);
        } else {
            // throw new ProductNotFoundException();
        }
    }

    public void clear(){
        items.clear();
        total = 0;
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public double getTotal(){
        total = 0;
        for (CartItem item : items) {
            total += item.getSubTotal();
        }
        return total;
    }

    public int getTotalItems() {
        int total = 0;
        for (CartItem item : items) {
            total += item.getQuantity();
        }
        return total;
    }
}
