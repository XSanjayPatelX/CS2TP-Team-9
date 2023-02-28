package com.food4u.website.controller;

import com.food4u.website.entity.User;
import com.food4u.website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping(value = "/welcome")
    public String homePage() {
        return "welcome";
    }

    @GetMapping(value = "/products")
    public String productPage() {
        return "products";
    }

    @GetMapping(value = "/about-us")
    public String aboutusPage() {
        return "about-us";
    }

    @GetMapping(value = "/contact")
    public String contactPage() {
        return "contact";
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping(value = "/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
}
