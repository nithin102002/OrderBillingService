package com.example.orderService.API;


import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.UserDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/user")
public interface UserAPI {




    @PostMapping("${AddUser}")
    public ResponseEntity<OrderResponseDTO> adduser(@RequestBody UserDTO userDTO);
}
