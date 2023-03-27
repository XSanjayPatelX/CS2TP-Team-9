package com.food4u.website.controller;

import com.food4u.website.entity.FoodItem;
import com.food4u.website.repository.FoodRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FoodItemController {
    @Autowired
    private FoodRepository repository;

    @GetMapping("/view")
    public ModelAndView getProducts(HttpSession session) {
        Map<String, Object> model = new HashMap<String, Object>();
        List<FoodItem> myList = repository.findAll();
        model.put("products", myList );
        return new ModelAndView("edit-product", model);
    }

    @PostMapping("/save")
    public String save(@ModelAttribute FoodItem foodItems) {
        foodItems.setUpdatedAt(Date.valueOf(LocalDate.now()));
        repository.save(foodItems);
        return "redirect:/view";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView mav = new ModelAndView("update-product");
        FoodItem foodItems = repository.findById(id).get();

        mav.addObject("title", "Edit an existing product");
        mav.addObject("products", foodItems);
        return mav;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
        repository.deleteById(id);
        return "redirect:/view";
    }

    @GetMapping("/newProduct")
    public ModelAndView showUpdateForm(){
        ModelAndView mav = new ModelAndView("update-product");
        mav.addObject("title", "Add a new product");
        FoodItem foodItem = new FoodItem();
        mav.addObject("products",foodItem);
        return mav;
    }
}
