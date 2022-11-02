package com.ecommersebackend.ecommercebackend.Repos;

import com.ecommersebackend.ecommercebackend.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
