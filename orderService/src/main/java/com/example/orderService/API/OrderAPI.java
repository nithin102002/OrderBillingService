package com.example.orderService.API;

import com.example.orderService.DTO.OrderDTO;
import com.example.orderService.DTO.OrderResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "${order}")
public interface OrderAPI {
    @PostMapping(value = "${placeOrder}")
    public ResponseEntity<OrderResponseDTO> order(@RequestBody OrderDTO orderDTO);
}
