package com.example.graphqlzemskiy.controllers;

import com.example.graphqlzemskiy.models.Goods;
import com.example.graphqlzemskiy.models.Shop;
import com.example.graphqlzemskiy.repo.GoodsRepo;
import com.example.graphqlzemskiy.repo.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    GoodsRepo goodsRepo;

    @Autowired
    ShopRepo shopRepo;

    @QueryMapping
    private List<Shop> shops(){
        return shopRepo.findAll();
    }

    @QueryMapping
    private List<Goods> goods(){
        return goodsRepo.findAll();
    }
}
