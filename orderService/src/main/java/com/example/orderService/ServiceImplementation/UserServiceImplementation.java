package com.example.orderService.ServiceImplementation;

import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.UserDTO;
import com.example.orderService.Model.UserDetails;
import com.example.orderService.Repository.UserRepo;
import com.example.orderService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {


    @Autowired
    UserRepo userRepo;
    @Override
    public ResponseEntity<OrderResponseDTO> adduser(UserDTO userDTO) {

        UserDetails userDetails= new UserDetails();
        userDetails.setUsername(userDTO.getUsername());
        UserDetails savedUserDetails=userRepo.save(userDetails);

        return ResponseEntity.status(HttpStatus.OK).body(new OrderResponseDTO(HttpStatus.OK,"User Details Added",savedUserDetails));
    }
}
