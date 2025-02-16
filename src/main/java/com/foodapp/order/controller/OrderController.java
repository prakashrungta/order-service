package com.foodapp.order.controller;

import com.foodapp.order.dto.OrderRequest;
import com.foodapp.order.entity.Order;
import com.foodapp.order.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
// @Tag(name = "Order Controller ", description = "APIs for managing Order")
public class OrderController {
  private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
  @Autowired private OrderService orderService;

  @GetMapping("/{custId}")
  @Tag(name = "Order Controller", description = "APIs for fetching customer")
  public List<Order> getOrders() {
    Logger logger = org.slf4j.LoggerFactory.getLogger(OrderController.class);
    logger.info("Fetching all orders");
    return orderService.getOrders();
  }

  @PostMapping("{custId}")
  @Tag(name = "Order Controller", description = "APIs for registering order with customerId")
  public ResponseEntity<Order> placeOrder(
      @PathVariable Integer custId, @RequestBody OrderRequest request) {
    logger.info("Order Controller: placeOrder");
    logger.info("Received Order for Customer ID: {} Order Name: {}", custId, request.getItemName());
    return ResponseEntity.ok(orderService.placeOrders(custId, request));
  }
}
