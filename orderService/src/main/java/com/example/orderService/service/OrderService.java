package com.example.orderService.service;


import com.example.orderService.DTO.OrderDTO;
import com.example.orderService.DTO.OrderResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    public ResponseEntity<OrderResponseDTO> placeOrder(OrderDTO orderDTO);
}
