package com.ecommersebackend.ecommercebackend.Repos;

import com.ecommersebackend.ecommercebackend.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Long> {
}
