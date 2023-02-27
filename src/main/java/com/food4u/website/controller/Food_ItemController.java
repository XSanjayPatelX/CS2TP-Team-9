package com.food4u.website.controller;
import java.time.LocalDate;
import com.food4u.website.entity.Food_Item;
import com.food4u.website.repository.Food_ItemRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.lang.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

@Controller
public class Food_ItemController {

@Autowired
private Food_ItemRepository repository;

    @GetMapping("/view")
    public ModelAndView getProducts(HttpSession session)
    {
        Map<String, Object> model = new HashMap<String, Object>();
        List<Food_Item> myList = repository.findAll();
        model.put("products", myList );
        return new ModelAndView("editproduct", model);
    }


    @PostMapping("/save")
    public String save(@ModelAttribute Food_Item foodItem){
        foodItem.setUpdatedAt(LocalDate.now());
        repository.save(foodItem);
        return "redirect:/view";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView mav = new ModelAndView("updateproduct");
        Food_Item foodItem = repository.findById(id).get();
        mav.addObject("products", foodItem);
        return mav;
    }
    @GetMapping("/newProduct")
    public ModelAndView showUpdateForm(){
        ModelAndView mav = new ModelAndView("updateproduct");
        return mav;
    }

}
