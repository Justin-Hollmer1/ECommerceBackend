package com.ecommersebackend.ecommercebackend.Controllers;

import com.ecommersebackend.ecommercebackend.Models.User;
import com.ecommersebackend.ecommercebackend.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "HELLO THERE";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/save-user")
    public String postUser(User user) {
        userRepo.save(user);
        return "IT WORKS LETS GOOOOOOOOOOOOOO";
    }

}
