package com.virtualmenu.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Product extends BaseModel {

    @Column(nullable = false)
    private String name;

    private String descripion;

    @Column(nullable = false)
    private Double price;
}
