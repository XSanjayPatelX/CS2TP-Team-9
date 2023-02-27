package com.food4u.website.controller;

import com.food4u.website.entity.FoodItem;
import com.food4u.website.repository.FoodItemRepository;
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
public class FoodItemController {
    @Autowired
    private FoodItemRepository repository;

    @GetMapping("/view")
    public ModelAndView getProducts(HttpSession session)
    {
        Map<String, Object> model = new HashMap<String, Object>();
        List<FoodItem> myList = repository.findAll();
        model.put("products", myList );
        return new ModelAndView("edit-product", model);
    }

    @PostMapping("/save")
    public String save(@ModelAttribute FoodItem foodItem){
        foodItem.setUpdatedAt(LocalDate.now());
        repository.save(foodItem);
        return "redirect:/view";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView mav = new ModelAndView("update-product");
        FoodItem foodItem = repository.findById(id).get();

        mav.addObject("title", "Edit an existing product");
        mav.addObject("products", foodItem);
        return mav;
    }

    @GetMapping("/newProduct")
    public ModelAndView showUpdateForm(){
        ModelAndView mav = new ModelAndView("update-product");
        mav.addObject("title", "Add a new product");
        return mav;
    }
}
