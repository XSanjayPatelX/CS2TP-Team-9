package com.food4u.website.controller;

import com.food4u.website.entity.Orders;
import com.food4u.website.entity.User;
import com.food4u.website.repository.FoodRepository;
import com.food4u.website.repository.OrderItemRepository;
import com.food4u.website.repository.OrderRepository;
import com.food4u.website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/orders")
    public ModelAndView orders() {
        Map<String, Object> model = new HashMap<String, Object>();
        List<Orders> myList = orderRepository.findAll();
        model.put("orders", myList);
        return new ModelAndView("orders", model);
    }

    @GetMapping("/orders/{id}")
    public ModelAndView viewOrder(@PathVariable("id") int id) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("order", orderRepository.findById(id));
        model.put("items", orderItemRepository.findAllByOrderId(id));

        return new ModelAndView("view-order", model);
    }

    @PostMapping("/orders/{id}/update")
    public String updateOrder(@ModelAttribute Orders order) {
        Orders updatedOrder = orderRepository.findById(order.getId());

        updatedOrder.setTotal(order.getTotal());
        updatedOrder.setIsDelivered(order.getIsDelivered());
        updatedOrder.setEstimatedDelivery(order.getEstimatedDelivery());

        orderRepository.save(updatedOrder);

        return "redirect:/admin/orders/" + order.getId();
    }

    @RequestMapping("/users")
    public ModelAndView users() {
        Map<String, Object> model = new HashMap<String, Object>();
        List<User> myList = userRepository.findAll();
        model.put("users", myList);
        return new ModelAndView("users", model);
    }

    @GetMapping("/users/{id}")
    public ModelAndView viewUser(@PathVariable("id") int id) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("user", userRepository.findById(id));


        return new ModelAndView("view-user", model);
    }

    @PostMapping("/users/{id}/edit")
    public String updateUser(@PathVariable("id") int id, @ModelAttribute User updatedUser) {
        User user = userRepository.findById(id);
        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setEmail(updatedUser.getEmail());
        user.setAddress1(updatedUser.getAddress1());
        user.setAddress2(updatedUser.getAddress2());
        user.setCity(updatedUser.getCity());
        user.setPostcode(updatedUser.getPostcode());
        userRepository.save(user);
        return "redirect:/admin/users/" + id;
    }

    @GetMapping("/users/{id}/edit")
    public ModelAndView editUser(@PathVariable("id") int id) {
        Map<String, Object> model = new HashMap<>();
        User user = userRepository.findById(id);
        model.put("user", user);
        return new ModelAndView("edit-user", model);
    }
}
