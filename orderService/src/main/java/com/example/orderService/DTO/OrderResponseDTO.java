package com.example.orderService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {

    private HttpStatus status;
    private String message;
    private Object data;
}
