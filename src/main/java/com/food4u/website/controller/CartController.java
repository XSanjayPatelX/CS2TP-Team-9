package com.food4u.website.controller;

//import com.food4u.website.dao.ProductRepository;
import com.food4u.website.entity.FoodItem;
import com.food4u.website.model.Cart;
import com.food4u.website.model.CartManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/basket")
public class CartController {

    @Autowired
    private CartManager cartManager;

    @RequestMapping("/add")
    public String add(HttpSession session, @RequestParam("id") FoodItem product,
                      @RequestParam(value = "qty", required = false, defaultValue = "1") int qty){
        Cart cart = cartManager.getCart(session);
        cart.addItem(product, qty);
        return "redirect:/menu";
    }

    @RequestMapping("/remove")
    public String remove(HttpSession session, @RequestParam("id") FoodItem product){
        Cart cart = cartManager.getCart(session);
        cart.removeItem(product);
        return "basket";
    }

    @RequestMapping("/update")
    public String update(HttpSession session, @RequestParam("id") FoodItem product, @RequestParam("qty") int qty){
        Cart cart = cartManager.getCart(session);
        cart.updateItem(product, qty);
        return "basket";
    }
}
