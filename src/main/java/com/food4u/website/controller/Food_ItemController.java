package com.example.demo.Food_Item;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.springframework.stereotype.Controller;

@Controller
public class Food_ItemController {

@Autowired
private Food_ItemRepository repository;

    @GetMapping({"/view", "/"})
    public ModelAndView getProducts(){
        //for(int i = 0; i > repository.count(); i++){
            //repository.getById(i).setImage(repository.getById(i).getImage());
    ModelAndView mav = new ModelAndView("productList");
    List<Food_Item> products = repository.findAll();
    mav.addObject("products", products);
    return mav;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Food_Item foodItem){
        foodItem.setUpdatedAt(LocalDate.now());
        repository.save(foodItem);
        return "redirect:/view";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView mav = new ModelAndView("updateProduct");
        Food_Item foodItem = repository.findById(id).get();
        mav.addObject("products", foodItem);
        return mav;
    }
}
