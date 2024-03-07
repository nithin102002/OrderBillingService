package com.example.orderService.API;


import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.ProductDTO;
import com.example.orderService.Model.ProductDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/product")
public interface ProductAPI {

    @PostMapping("addProduct")
    public ResponseEntity<OrderResponseDTO> addproduct(@RequestBody ProductDTO productDTO);

    @GetMapping("getProducts")
    public List<ProductDetails> getproduct();
}
