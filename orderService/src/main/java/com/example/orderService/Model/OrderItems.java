package com.example.orderService.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne()
    @JoinColumn(name="product_id")
    private ProductDetails productDetails;
    private int quantity;

}
