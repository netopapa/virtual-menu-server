package com.virtualmenu.DTO;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ProductDTO {
    private Integer id;

    private String name;

    private String descripion;

    private Double price;
}
