package com.example.restaurant.Resource;


import com.example.restaurant.Model.FoodCategory;
import com.example.restaurant.service.FoodCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= "http://localhost:4200")
public class Category {
    @Autowired
    FoodCategoryService service;
    @GetMapping("/category")
    public List<FoodCategory> getCategory()
    {
        return  this.service.getCategory();
    }
}
