package com.food4u.website.controller;

import com.food4u.website.entity.FoodItem;
import com.food4u.website.repository.FoodItemRepository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodItemController {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @GetMapping("/view")
    public ModelAndView getProducts(HttpSession session) {
        Map<String, Object> model = new HashMap<>();
        List<FoodItem> myList = foodItemRepository.findAll();
        model.put("products", myList);
        return new ModelAndView("edit-product", model);
    }

    @PostMapping("/save")
    public String save(@ModelAttribute FoodItem foodItem) {
        foodItem.setUpdatedAt(LocalDate.now());
        foodItemRepository.save(foodItem);
        return "redirect:/view";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView mav = new ModelAndView("update-product");
        FoodItem foodItem = foodItemRepository.findById(id).get();

        mav.addObject("title", "Edit an existing product");
        mav.addObject("products", foodItem);
        return mav;
    }

    @GetMapping("/newProduct")
    public ModelAndView showUpdateForm() {
        ModelAndView mav = new ModelAndView("update-product");
        mav.addObject("title", "Add a new product");
        return mav;
    }

    @GetMapping("/products")
    public ModelAndView getProductsPage() {
        Map<String, Object> model = new HashMap<>();
        List<FoodItem> items = foodItemRepository.findAll();
        model.put("items", items);
        return new ModelAndView("products", model);
    }
}
