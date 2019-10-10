package com.virtualmenu.DTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ShoppingCartDTO {

    private Long id;

    private RestaurantTableDTO table;

    private Boolean closed;

    private BigDecimal total;
}
