package com.ecommersebackend.ecommercebackend.Controllers;


import com.ecommersebackend.ecommercebackend.Models.Item;
import com.ecommersebackend.ecommercebackend.Repos.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepo itemRepo;

    // Get all items
    @GetMapping(value = "/get-items")
    public List<Item> getItems() {
        return itemRepo.findAll();
    }


//    Get item by id
    @GetMapping(value = "/get-item-by-id/{id}")
    public Item getItemById(@PathVariable long id) {
        return itemRepo.findById(id).get();
    }


    // Post item
    @PostMapping(value = "/post-item")
    public String postItem(@RequestBody Item item) {
        itemRepo.save(item);
        return "Item has been successfully added.";
    }

//    Update item by id
    @PutMapping(value = "/update-item/{id}")
    public Item updateItem(@PathVariable long id, @RequestBody Item item) {
        Item itemToUpdate = itemRepo.findById(id).get();
        itemToUpdate.setName(item.getName());
        itemToUpdate.setCost(item.getCost());
        itemToUpdate.setImage_url(item.getImage_url());
        itemRepo.save(itemToUpdate);
        return item;
    }

    // Delete item by id
    @DeleteMapping(value = "/delete-item/{id}")
    public Item deleteItem(@PathVariable long id) {
        Item itemToDelete = itemRepo.findById(id).get();
        itemRepo.delete(itemToDelete);
        return itemToDelete;
    }




}
