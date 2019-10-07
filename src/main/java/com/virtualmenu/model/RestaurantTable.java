package com.virtualmenu.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "restaurant_table")
public class RestaurantTable extends BaseModel {

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = false)
    private Boolean busy;

}
