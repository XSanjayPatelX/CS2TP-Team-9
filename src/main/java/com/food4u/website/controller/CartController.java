package com.food4u.website.controller;

//import com.food4u.website.dao.ProductRepository;
import com.food4u.website.entity.FoodItem;
import com.food4u.website.entity.OrderItem;
import com.food4u.website.entity.Orders;
import com.food4u.website.entity.User;
import com.food4u.website.model.Cart;
import com.food4u.website.model.CartItem;
import com.food4u.website.model.CartManager;
import com.food4u.website.repository.FoodRepository;
import com.food4u.website.repository.OrderItemRepository;
import com.food4u.website.repository.OrderRepository;
import com.food4u.website.repository.UserRepository;
import com.food4u.website.security.CustomUserDetails;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

@Controller
@RequestMapping("/basket")
public class CartController {

    @Autowired
    private CartManager cartManager;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

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

    @GetMapping("/checkout")
    public String checkout(Authentication authentication, HttpSession session, @ModelAttribute Orders order) {
        Cart cart = cartManager.getCart(session);
        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        User user = userRepository.findByEmail(userDetails.getEmail());

        if (!cart.isEmpty()) {
            LocalDateTime now = LocalDateTime.now();

            order.setOrderDate(now);
            order.setEstimatedDelivery(now.plusHours(1));
            order.setIsDelivered(false);
            order.setUser(user);
            order.setTotal((float) cart.getTotal());

            Orders savedOrder = orderRepository.save(order);

            for (int i = 0; i < cart.getItemCount(); i++) {
                CartItem cartItem = cart.getItems().get(i);
                FoodItem foodItem = cartItem.getProduct();

                OrderItem orderItem = new OrderItem();

                orderItem.setOrder(savedOrder);
                orderItem.setQuantity(cartItem.getQuantity());
                orderItem.setPrice(foodItem.getPrice());
                orderItem.setCategory(foodItem.getCategory());
                orderItem.setName(foodItem.getName());
                orderItem.setFoodItem(foodItem);

                orderItemRepository.save(orderItem);
                orderItemRepository.flush();
            }

            cartManager.removeCart(session);
            cartManager.getCart(session);
        }

        return "checkout";
    }
}
