package com.foodapp.order.service;


import com.foodapp.order.entity.Order;
import com.foodapp.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order saveOrders(Order order) {
        return orderRepository.save(order);
    }
}
