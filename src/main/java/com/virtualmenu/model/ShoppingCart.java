package com.virtualmenu.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ShoppingCart extends BaseModel {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private RestaurantTable table;

    @Column(nullable = false)
    private Boolean closed;
}
