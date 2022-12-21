package com.example.graphqlzemskiy.repo;

import com.example.graphqlzemskiy.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<Shop, Long> {
    Shop findShopByName(String name);
}
