package com.food4u.website.controller;

import com.food4u.website.entity.User;
import com.food4u.website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Calendar;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepo;

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

    @PostMapping(value = "/register")
    public String registerSubmit(User user) {
        user.setPassword(user.getPassword()); // TODO: Encrypt password
        user.setIsAdmin(false);
        user.setJoinDate(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));

        userRepo.save(user);

        return "welcome";
    }
}
