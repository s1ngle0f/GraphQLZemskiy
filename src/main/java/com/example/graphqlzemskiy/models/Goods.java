package com.example.graphqlzemskiy.models;
import jakarta.persistence.*;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private float price;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    public Goods(String name, float price, Shop shop) {
        this.name = name;
        this.price = price;
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", shop=" + shop +
                '}';
    }
}
