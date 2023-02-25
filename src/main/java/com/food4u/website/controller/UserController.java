package com.food4u.website.controller;

import com.food4u.website.model.User;
import com.food4u.website.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/add")
    public @ResponseBody String addNewUser (/*@RequestParam String first_name,*/ @RequestParam String email_address, @RequestParam String password) {
        User n = new User();
//        n.getFirst_name(first_name);
        n.getEmail_address(email_address);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(value = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
