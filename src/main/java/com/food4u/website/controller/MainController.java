package com.food4u.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String welcomePage(ModelMap modelMap, @RequestParam String email, @RequestParam String password) {
        if (email.equals("Admin@f4u.com") && password.equals("Root")) {
            return "welcome";
        }
        modelMap.put("errorMsg", "Please provide the correct email and password");
        return "login";
    }

    @GetMapping(value = "/register")
    public String registerPage() {
        return "register";
    }
}
