package com.ecommersebackend.ecommercebackend.Controllers;

import com.ecommersebackend.ecommercebackend.Models.Order;
import com.ecommersebackend.ecommercebackend.Models.User;
import com.ecommersebackend.ecommercebackend.Repos.OrderRepo;
import com.ecommersebackend.ecommercebackend.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    UserRepo userRepo;

//    Get all orders WORKING
    @GetMapping(value = "/get-orders")
    public List<Order> getOrders() {
        return orderRepo.findAll();
    }

//    Post order WORKING
    @PostMapping(value = "/post-order-user-id/{userid}")
    public String postOrder(@PathVariable long userid, @RequestBody Order order) {
        User userToAdd = userRepo.findById(userid).get();
        order.setUser(userToAdd);
        orderRepo.save(order);
        return "IT WORKED";
    }

//    Update order by id WORKING
    @PutMapping(value = "/update-order/{id}")
    public String updateOrder(@PathVariable long id, @RequestBody Order order) {
        Order updatedOrder = orderRepo.findById(id).get();
        updatedOrder.setDate(order.getDate());
        updatedOrder.setCost(order.getCost());
        orderRepo.save(updatedOrder);
        return id + " has been updated.";
    }

//    Delete by id WORKING
    @DeleteMapping(value = "/delete-order/{id}")
    public String deleteOrder(@PathVariable long id) {
        orderRepo.delete(orderRepo.findById(id).get());
        return id + " has been deleted";
    }

}
