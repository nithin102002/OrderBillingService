package com.example.BillingService.Repository;

import com.example.BillingService.Model.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends MongoRepository<Bill,Integer> {
}
