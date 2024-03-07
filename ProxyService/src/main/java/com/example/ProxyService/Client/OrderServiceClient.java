package com.example.ProxyService.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "OrderService",url = "http://localhost:8080/order/placeOrder")
public interface OrderServiceClient {


    @PostMapping("/process-order")
    void processOrder();


}
