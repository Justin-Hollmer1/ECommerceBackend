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

//    Get all orders
    @GetMapping(value = "/get-orders")
    public List<Order> getOrders() {
        return orderRepo.findAll();
    }

//    Post order
    @PostMapping(value = "/post-order")
    public String postOrder(@RequestBody Order order) {
        orderRepo.save(order);
        return "IT WORKED";
    }

//    Update order by id
    @PutMapping(value = "/update-order/{id}")
    public String updateOrder(@PathVariable long id, @RequestBody Order order) {
        Order updatedOrder = orderRepo.findById(id).get();
        updatedOrder.setDate(order.getDate());
        updatedOrder.setCost(order.getCost());
        orderRepo.save(updatedOrder);
        return id + " has been updated.";
    }

//    Delete by id
    @DeleteMapping(value = "/delete-order/{id}")
    public String deleteOrder(@PathVariable long id) {
        orderRepo.delete(orderRepo.findById(id).get());
        return id + " has been deleted";
    }

}
