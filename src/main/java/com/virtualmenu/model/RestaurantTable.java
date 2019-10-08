package com.virtualmenu.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "restaurant_table")
public class RestaurantTable extends BaseModel {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = false)
    private Boolean busy;

}
