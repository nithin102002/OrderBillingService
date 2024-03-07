package com.example.orderService.Repository;

import com.example.orderService.Model.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderItemsRepo extends JpaRepository<OrderItems,Long> {
}
