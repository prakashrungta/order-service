package com.foodapp.order.service;

import com.foodapp.order.dto.OrderRequest;
import com.foodapp.order.entity.Order;
import com.foodapp.order.repository.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  @Autowired private OrderRepository orderRepository;

  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public List<Order> getOrders() {
    return orderRepository.findAll();
  }

  public Order placeOrders(Integer customerId, OrderRequest request) {
    Order order = new Order(customerId, request.getItemName(), request.getQuantity());
    return orderRepository.save(order);
  }
}
