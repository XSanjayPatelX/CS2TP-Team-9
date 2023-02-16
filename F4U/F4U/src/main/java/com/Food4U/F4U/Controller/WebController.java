package com.Food4U.F4U.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class WebController {

    @GetMapping("/Home")
    public String home(Model model) {
        //model.addAttribute("something", "this is from the controller");
        return "Home";
    }

    @GetMapping("/ContactUs")
    public String contactus(Model model) {
        return "Contact Us";
    }
}
