package com.example.restaurant.repository;

import com.example.restaurant.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}