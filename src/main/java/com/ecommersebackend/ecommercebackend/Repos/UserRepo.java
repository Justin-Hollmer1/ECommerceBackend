package com.ecommersebackend.ecommercebackend.Repos;

import com.ecommersebackend.ecommercebackend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
