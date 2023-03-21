package com.food4u.website.controller;

import com.food4u.website.entity.FoodItems;
import com.food4u.website.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.*;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;

@Controller
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @GetMapping("/view")
    public ModelAndView getProducts(HttpSession session) {
        Map<String, Object> model = new HashMap<String, Object>();
        List<FoodItems> myList = repository.findAll();
        model.put("products", myList );
        return new ModelAndView("edit-product", model);
    }

    @PostMapping("/save")
    public String save(@ModelAttribute FoodItems foodItems) {
        foodItems.setUpdated_at(String.valueOf(LocalDate.now()));
        repository.save(foodItems);
        return "redirect:/view";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView mav = new ModelAndView("update-product");
        FoodItems foodItems = repository.findById(id).get();

        mav.addObject("title", "Edit an existing product");
        mav.addObject("products", foodItems);
        return mav;
    }

    @GetMapping("/updateproduct")
    public ModelAndView showUpdateForm(){
        ModelAndView mav = new ModelAndView("update-product");
        mav.addObject("title", "Add a new product");
        return mav;
    }
}
