package com.example.orderService.Repository;

import com.example.orderService.Model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDetails,Long> {

}
