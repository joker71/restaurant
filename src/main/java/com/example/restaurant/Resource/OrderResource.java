package com.example.restaurant.Resource;

import com.example.restaurant.Model.Order;
import com.example.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= "http://localhost:4200")
public class OrderResource {
    @Autowired
    private OrderService ser;
    @GetMapping ("/order")
    public List<Order> getAll()
    {
        return  this.ser.getOrder();
    }
}
