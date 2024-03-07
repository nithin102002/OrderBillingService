package com.example.orderService.ServiceImplementation;

import com.example.orderService.DTO.OrderDTO;
import com.example.orderService.DTO.OrderResponseDTO;
import com.example.orderService.DTO.ProductList;
import com.example.orderService.Model.OrderDetails;
import com.example.orderService.Model.OrderItems;
import com.example.orderService.Model.ProductDetails;
import com.example.orderService.Model.UserDetails;
import com.example.orderService.Repository.OrderDetailRepo;
import com.example.orderService.Repository.OrderItemsRepo;
import com.example.orderService.Repository.ProductRepo;
import com.example.orderService.Repository.UserRepo;
import com.example.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImplementation implements OrderService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private OrderDetailRepo orderDetailRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private OrderItemsRepo orderItemsRepo;
     Double totalAmount=0.0;
    @Override
    public ResponseEntity<OrderResponseDTO> placeOrder(OrderDTO orderDTO) {
        OrderDetails orderDetails = new OrderDetails();

        Optional<UserDetails> user = userRepo.findById(orderDTO.getUserid());
        List<OrderItems> orders = new ArrayList<>();
        if (user.isPresent()) {

            if (!orderDTO.getProductlist().isEmpty()) {
                orderDetails.setUser(user.get());
                orderDetails.setShippingAddress(orderDTO.getAddress());
                orderDetails.setOrderDate(new Date());

                List<Long> productId = new ArrayList<>();
                OrderDetails savedOrderDetails = orderDetailRepo.save(orderDetails);
                for (ProductList i : orderDTO.getProductlist()) {
                    productId.add(i.getProductId());
                }
                List<ProductDetails> productDetails = productRepo.findByProductIdIn(productId);

                List<Long> productDetailsId=new ArrayList<>();
                ProductList productList = new ProductList();
              List<Long> productListNotAvailable= new ArrayList<>();
                productDetails.forEach(productDetails1 -> productDetailsId.add(productDetails1.getProductId()));


                for(ProductList product:orderDTO.getProductlist())
                {

                   if( productDetailsId.contains(product.getProductId()))
                    {
                        int indexOfTheProduct=productDetailsId.indexOf(product.getProductId());
                        ProductDetails productDetails1=productDetails.get(indexOfTheProduct);
                OrderItems orderItems = new OrderItems();
//                    Optional<ProductDetails> productDetails =productRepo.findById(i.getProductId());
                     int quantity = product.getQuantity();
                        totalAmount +=  (quantity * productDetails1.getPrice());
                        orderItems.setProductDetails(productDetails1);
                        orderItems.setQuantity(product.getQuantity());
                        orderDetails.setOrderItems(orderItems);
                        orderDetails.setOrderStatus("Sucess");
                        orderDetails.setTotalAmount(totalAmount.longValue());
                        orders .add(orderItemsRepo.save(orderItems));

                    }
                   else {
                       productListNotAvailable.add(product.getProductId());
                       return ResponseEntity.status(HttpStatus.OK).body(new OrderResponseDTO(HttpStatus.OK, "Product is Not Available ",productListNotAvailable));
                   }
                }
            }
            else {
                return ResponseEntity.status(HttpStatus.OK).body(new OrderResponseDTO(HttpStatus.OK, "Order Details ", "Your Order is Empty"));
            }
        }


        return ResponseEntity.status(HttpStatus.OK).body(new OrderResponseDTO(HttpStatus.OK, "Order Details ", orderDetails));
    }
}
