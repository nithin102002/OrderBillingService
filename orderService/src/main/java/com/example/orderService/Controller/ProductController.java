package com.example.orderService.Controller;

import com.example.orderService.API.ProductAPI;
import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.ProductDTO;
import com.example.orderService.Model.ProductDetails;
import com.example.orderService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController implements ProductAPI {
  @Autowired
    ProductService productService;
    @PostMapping("/addProduct")
    public ResponseEntity<OrderResponseDTO> addproduct(@RequestBody ProductDTO productDTO){
        return productService.addproduct(productDTO);

    }


    public List<ProductDetails> getproduct(){
     return productService.getproduct();
    }
}
