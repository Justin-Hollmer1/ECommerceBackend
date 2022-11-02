package com.ecommersebackend.ecommercebackend.Controllers;

import com.ecommersebackend.ecommercebackend.Models.Order;
import com.ecommersebackend.ecommercebackend.Repos.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @GetMapping(value = "/get-orders")
    public List<Order> getOrders() {
        return orderRepo.findAll();
    }

    @PostMapping(value = "/post-order")
    public String postOrder(@RequestBody Order order) {
        orderRepo.save(order);
        return "IT WORKED";
    }

    @PutMapping(value = "/update-order/{id}")
    public Order updateOrder(@PathVariable long id, @RequestBody Order order) {
        Order updatedOrder = orderRepo.findById(id).get();
        updatedOrder.setDate(order.getDate());
        updatedOrder.setCost(order.getCost());
        orderRepo.save(updatedOrder);
        return order;
    }

}
