package com.example.orderService.ServiceImplementation;

import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.ProductDTO;
import com.example.orderService.Model.ProductDetails;
import com.example.orderService.Repository.ProductRepo;
import com.example.orderService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    ProductRepo productRepo;
    @Override
    public ResponseEntity<OrderResponseDTO> addproduct(ProductDTO productDTO) {

        ProductDetails productDetails= new ProductDetails();
        productDetails.setProductname(productDTO.getProductname());
        productDetails.setProductDescryption(productDTO.getProductDescryption());
        productDetails.setPrice(productDTO.getPrice());
        productDetails.setQuantityAvailable(productDTO.getQuantityAvailable());
        ProductDetails savedProductDetails= productRepo.save(productDetails);
        return ResponseEntity.status(HttpStatus.OK).body(new OrderResponseDTO(HttpStatus.OK,"Product Details Added",savedProductDetails));
    }

    @Override
    public List<ProductDetails> getproduct() {

        return productRepo.findAll();
    }
}
