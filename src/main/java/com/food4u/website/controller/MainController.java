package com.food4u.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/about-us")
    public String about() {
        return "about-us";
    }

    @GetMapping("/basket")
    public String basket() {
        return "basket";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }
}
