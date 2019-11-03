package com.virtualmenu.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductDTO {
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;
}
