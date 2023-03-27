package com.food4u.website.controller;

import com.food4u.website.entity.Orders;
import com.food4u.website.repository.FoodRepository;
import com.food4u.website.repository.OrderItemRepository;
import com.food4u.website.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
