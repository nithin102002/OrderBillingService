package com.example.orderService.Controller;

import com.example.orderService.API.OrderAPI;
import com.example.orderService.DTO.OrderDTO;
import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderControler implements OrderAPI {
  @Autowired
    OrderService orderService;
    @PostMapping("placeOrder")
    public ResponseEntity<OrderResponseDTO> order(@RequestBody OrderDTO orderDTO){
        return orderService.placeOrder(orderDTO);

    }
}
