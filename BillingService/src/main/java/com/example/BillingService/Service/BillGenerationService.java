package com.example.BillingService.Service;

import com.example.BillingService.DTO.OrderBillDTO;

public interface BillGenerationService {
    public String createBill(OrderBillDTO orderBill);
}
