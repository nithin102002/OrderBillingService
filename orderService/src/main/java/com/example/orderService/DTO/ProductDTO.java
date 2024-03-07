package com.example.orderService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {

    private String productname;
    private String productDescryption;
    private Double price;
    private int quantityAvailable;
}
