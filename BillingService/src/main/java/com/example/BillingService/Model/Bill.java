package com.example.BillingService.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Billing_Service")
public class Bill {


    @Id
    private int id;
    private Long userid;
    private String username;
    private Long orderid;
    private Long totalAmount;
}
