package com.example.orderService.service;

import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.UserDTO;
import com.example.orderService.Model.UserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public ResponseEntity<OrderResponseDTO> adduser(UserDTO userDTO);
}
