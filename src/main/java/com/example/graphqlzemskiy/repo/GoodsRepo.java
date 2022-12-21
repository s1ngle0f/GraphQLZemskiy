package com.example.graphqlzemskiy.repo;

import com.example.graphqlzemskiy.models.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepo extends JpaRepository<Goods, Long> {

}
