package com.virtualmenu.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cooking_request")
public class CookingRequest extends BaseModel {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne()
    private Product product;

    @ManyToOne()
    private ShoppingCart shoppingCart;

    @Column(nullable = false)
    private Boolean isCooking;
}
