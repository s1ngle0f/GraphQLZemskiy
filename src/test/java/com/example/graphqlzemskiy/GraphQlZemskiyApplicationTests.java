package com.example.graphqlzemskiy;

import com.example.graphqlzemskiy.models.Goods;
import com.example.graphqlzemskiy.models.Shop;
import com.example.graphqlzemskiy.repo.GoodsRepo;
import com.example.graphqlzemskiy.repo.ShopRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GraphQlZemskiyApplicationTests {

    @Autowired
    GoodsRepo goodsRepo;

    @Autowired
    ShopRepo shopRepo;

    @Test
    void addGoods(){
//        Goods goods0 = new Goods("Rediska", 123f, shopRepo.findShopByName("Stick ur finger in my ass"));
//        Goods goods1 = new Goods("Pipiska", 312f, shopRepo.findShopByName("Fucking SLAAAVE"));
        Goods goods0 = new Goods("Vanish", 100f, shopRepo.findShopByName("Stick ur finger in my ass"));
        Goods goods1 = new Goods("Kukish", 777f, shopRepo.findShopByName("Fucking SLAAAVE"));
        goodsRepo.saveAndFlush(goods0);
        goodsRepo.saveAndFlush(goods1);
    }

    @Test
    void addShop(){
//        Shop shop = new Shop("Stick ur finger in my ass");
        Shop shop = new Shop("Fucking SLAAAVE");
        shopRepo.saveAndFlush(shop);
    }

    @Test
    void allShops(){
        System.out.println(shopRepo.findAll());
    }

    @Test
    void allGoods(){
        System.out.println(goodsRepo.findAll());
    }
}
