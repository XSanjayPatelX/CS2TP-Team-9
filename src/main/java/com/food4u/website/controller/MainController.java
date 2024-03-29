package com.food4u.website.controller;

import com.food4u.website.entity.FoodItem;
import com.food4u.website.model.Cart;
import com.food4u.website.model.CartManager;
import com.food4u.website.repository.FoodRepository;
import com.food4u.website.security.CustomUserDetails;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping({"/", "/index"})
    public String home(HttpSession session) {
        Cart c = new CartManager().getCart(session);
        return "index";
    }

    @GetMapping("/menu")
    public ModelAndView getProductsPage() {
        Map<String, Object> model = new HashMap<>();
        List<FoodItem> items = foodRepository.findAll();
        model.put("items", items);
        return new ModelAndView("menu", model);
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

    @GetMapping("/shop")
    public String shop(Model model){
        model.addAttribute("products", foodRepository.findAll());
        return "shop";
    }

    @GetMapping("/user/address")
    public String getUserAddress(Authentication authentication) {
        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        String address = userDetails.getPassword();
        System.out.println(address);

        return "basket";
    }
}
