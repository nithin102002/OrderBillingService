package com.example.orderService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import com.example.orderService.Model.ProductDetails;
import com.example.orderService.Model.UserDetails;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private List<ProductList> productlist;

    private Long userid;

    private String address;
}
