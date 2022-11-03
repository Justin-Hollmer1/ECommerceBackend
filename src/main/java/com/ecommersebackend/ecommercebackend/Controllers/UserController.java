package com.ecommersebackend.ecommercebackend.Controllers;

import com.ecommersebackend.ecommercebackend.Models.User;
import com.ecommersebackend.ecommercebackend.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

//    Default
    @GetMapping(value = "/")
    public String getPage() {
        return "HELLO THERE";
    }

//    Get all
    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

//    Get by id
    @GetMapping(value = "/user-{id}")
    public User getUserById(@PathVariable long id) {
        return userRepo.findById(id).get();
    }

//    Post
    @PostMapping(value = "/save-user")
    public String postUser(@RequestBody User user) {
        userRepo.save(user);
        return "IT WORKS LETS GOOOOOOOOOOOOOO";
    }

//    Update
    @PutMapping(value = "/update-user/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setUsername(user.getUsername());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setAdmin_status(user.getAdmin_status());
        userRepo.save(updatedUser);
        return "Updated";
    }

//    Delete

    @DeleteMapping(value = "/delete-user/{id}")
    public String deleteUser(@PathVariable long id) {
        User userToDelete = userRepo.findById(id).get();
        userRepo.delete(userToDelete);
        return "Deleted user: " + userToDelete.getUsername();
    }
}
