package com.example.orderService.Controller;

import com.example.orderService.API.UserAPI;
import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.UserDTO;
import com.example.orderService.Model.UserDetails;
import com.example.orderService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class UserController implements UserAPI {

    @Autowired
    UserService userService;



    public ResponseEntity<OrderResponseDTO> adduser(@RequestBody UserDTO userDTO){
        return userService.adduser(userDTO);

    }

}
