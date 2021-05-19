package com.example.restaurant.service;

import com.example.restaurant.Model.Order;
import com.example.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository rep;
    public List<Order> getOrder()
    {
        return this.rep.findAll();
    }
}
