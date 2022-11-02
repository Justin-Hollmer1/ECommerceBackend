package com.ecommersebackend.ecommercebackend.Controllers;

import com.ecommersebackend.ecommercebackend.Repos.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

//    @GetMapping(value = "/get-order-user/{}")

}
