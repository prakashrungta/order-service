package com.foodapp.order.controller;

import com.foodapp.order.entity.Order;
import com.foodapp.order.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
//@Tag(name = "Order Controller ", description = "APIs for managing Order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    @Tag(name = "Order Controller", description = "APIs for fetching customer")
    public List<Order> getOrders() {
        Logger logger = org.slf4j.LoggerFactory.getLogger(OrderController.class);
        logger.info("Fetching all orders");
        return orderService.getOrders();
    }

  @PostMapping("/orders")
  @Tag(name = "Order Controller", description = "APIs for registering order")
  public ResponseEntity<Order> register(@RequestBody Order order) {
    return ResponseEntity.ok(orderService.saveOrders(order));
        }
}
