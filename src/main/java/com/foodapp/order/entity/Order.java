package com.foodapp.order.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the ID
  private Integer orderId;

  private Integer customerId;

  private String orderName;

  private Integer quantity;

  public Order(Integer customerId, String itemName, int quantity) {
    this.customerId = customerId;
    this.orderName = itemName;
    this.quantity = quantity;
  }
}
