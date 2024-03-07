package com.example.orderService.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderid;

    @ManyToOne
    @JoinColumn(name="userid")
    private UserDetails user;
    private Date orderDate;
    @ManyToOne
    @JoinColumn(name="order_items")
    private OrderItems orderItems;
    private String orderStatus;
    private String shippingAddress;
    private Long totalAmount;



}
