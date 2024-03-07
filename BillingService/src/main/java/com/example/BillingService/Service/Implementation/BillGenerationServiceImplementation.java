package com.example.BillingService.Service.Implementation;

import com.example.BillingService.DTO.OrderBillDTO;
import com.example.BillingService.Service.BillGenerationService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

@Service
public class BillGenerationServiceImplementation implements BillGenerationService {
    @Override
    public String createBill(OrderBillDTO orderBill) {



        return null;
    }
}
