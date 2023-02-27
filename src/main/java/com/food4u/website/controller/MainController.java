package com.food4u.website.controller;

import com.food4u.website.entity.User;
import com.food4u.website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Calendar;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping(value = "/welcome")
    public String homePage() {
        return "welcome";
    }

    @GetMapping(value = "/product")
    public String productPage() {
        return "product";
    }

    @GetMapping(value = "editproduct")
    public String editproductPage() {
        return "editproduct";
    }

    @GetMapping(value = "updateproduct")
    public String updateproductPage() {
        return "updateproduct";
    }

    @GetMapping(value = "/aboutus")
    public String aboutusPage() {
        return "aboutus";
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String loginSubmit(User user, ModelMap modelMap) {

        if (userRepo.existsByEmail(user.getEmail())) {
            User u = userRepo.findByEmail(user.getEmail());

            if (u.getPassword().equals(user.getPassword())) {
                modelMap.put("user", u);
                return "welcome";
            }
        }

        modelMap.put("errorMsg", "Email or password is incorrect");
        return "login";
    }

    @GetMapping(value = "/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping(value = "/register")
    public String registerSubmit(User user) {
        user.setPassword(user.getPassword()); // TODO: Encrypt password
        user.setIsAdmin(false);
        user.setJoinDate(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));

        userRepo.save(user);

        return "welcome";
    }
}
