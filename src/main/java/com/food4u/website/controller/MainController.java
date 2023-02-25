package com.food4u.website.controller;

import com.food4u.website.Entity.User;
import com.food4u.website.Entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/welcome")
    public String homePage() {
        return "welcome";
    }

    @GetMapping(value = "/products")
    public String productsPage() {
        return "products";
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String loginSubmit(User user, ModelMap modelMap) {
        User s = userRepository.findByEmail(user.getEmail_address());
        String f = s.getFirst_name();
        if (s.getPassword().equals(user.getPassword())) {
            modelMap.put("first_name", f);
            return "welcome";
        }
        modelMap.put("errorMsg", "Please provide the correct email and password");
        return "login";
    }

    @GetMapping(value = "/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping(value = "/register")
    public String registerSubmit(User user) {
        user.setPassword(user.getPassword());
        userRepository.save(user);

        return "welcome";
    }
}
