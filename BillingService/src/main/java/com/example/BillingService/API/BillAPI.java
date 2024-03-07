package com.example.BillingService.API;

import com.example.BillingService.DTO.OrderBillDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "${Bill}")
public interface BillAPI {

    @PostMapping(value = "${CreateBill}")
    public String createBill(OrderBillDTO orderBill);
}
