package com.virtualmenu.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "cooking_request")
public class CookingRequest extends BaseModel {

    @ManyToOne()
    private Product product;

    @ManyToOne()
    private ShoppingCart shoppingCart;

    @Column(nullable = false)
    private Boolean isCooking;
}
