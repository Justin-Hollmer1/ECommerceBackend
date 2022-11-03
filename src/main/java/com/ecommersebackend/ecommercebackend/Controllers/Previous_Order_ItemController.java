//package com.ecommersebackend.ecommercebackend.Controllers;
//
//
//import com.ecommersebackend.ecommercebackend.Models.Previous_Order_Item;
//import com.ecommersebackend.ecommercebackend.Repos.Previous_Order_Items_Repo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class Previous_Order_ItemController {
//
//    @Autowired
//    Previous_Order_Items_Repo previous_order_items_repo;
//
//    @GetMapping(value = "/get-all-order-items")
//    public List<Previous_Order_Item> getAllOrderItems() {
//        return previous_order_items_repo.findAll();
//    }
//
//    @PostMapping(value = "/post-order-item")
//    public String postOrderItem(@RequestBody Previous_Order_Item item) {
//        previous_order_items_repo.save(item);
//        return "Item has been saved.";
//    }
//
//    @DeleteMapping(value = "/delete-order-item/{id}")
//    public Previous_Order_Item deleteOrderItem(@PathVariable long id) {
//        Previous_Order_Item orderItemToDelete = previous_order_items_repo.findById(id).get();
//        previous_order_items_repo.delete(orderItemToDelete);
//        return orderItemToDelete;
//    }
//
//
//}
