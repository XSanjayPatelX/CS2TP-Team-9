package com.testing1.test1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    @GetMapping("/Hello")
    String getPeople(Model model) {
        model.addAttribute("something", "this is from the controller");
        return "people";
    }
}
