package com.example.restaurant.repository;

import com.example.restaurant.Model.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface FoodCategoryRepository  extends JpaRepository<FoodCategory, Long> {
}
