package com.virtualmenu.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {
    private Long id;

    private String name;

    private String description;

    private Double price;
}
