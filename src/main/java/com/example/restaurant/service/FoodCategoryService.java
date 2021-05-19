package com.example.restaurant.service;

import com.example.restaurant.Model.FoodCategory;
import com.example.restaurant.repository.FoodCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodCategoryService {
    @Autowired
    FoodCategoryRepository rep;
    @Transactional(readOnly = true)
    public List<FoodCategory> getCategory()
    {
        return this.rep.findAll();
    }



    
}
