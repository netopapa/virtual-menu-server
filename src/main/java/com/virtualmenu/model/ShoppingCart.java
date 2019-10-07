package com.virtualmenu.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ShoppingCart extends BaseModel {

    @ManyToOne
    private RestaurantTable table;

    @Column(nullable = false)
    private Boolean closed;
}
