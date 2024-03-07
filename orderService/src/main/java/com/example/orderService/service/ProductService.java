package com.example.orderService.service;

import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.ProductDTO;
import com.example.orderService.Model.ProductDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public ResponseEntity<OrderResponseDTO> addproduct(ProductDTO productDTO);
    public List<ProductDetails> getproduct();
}
