package com.example.orderService.Repository;

import com.example.orderService.Model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetails,Long> {
}
