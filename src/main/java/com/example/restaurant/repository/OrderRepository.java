package com.example.restaurant.repository;

import com.example.restaurant.Model.Order;
import com.example.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("/api")
@CrossOrigin(origins= "http://localhost:4200")
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Autowired
    OrderService ser = null;
    
    
}
