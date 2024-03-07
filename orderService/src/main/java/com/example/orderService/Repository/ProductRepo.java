package com.example.orderService.Repository;

import com.example.orderService.Model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<ProductDetails,Long> {
//    Optional<ProductDetails> findByProductIdIn(List<Long> productIds);

//    Optional<ProductDetails> findOneByProductIdIn(List<Long> productId);

    List<ProductDetails> findByProductIdIn(List<Long> productId);
}
