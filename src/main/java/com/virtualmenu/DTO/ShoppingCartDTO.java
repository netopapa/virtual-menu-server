package com.virtualmenu.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShoppingCartDTO {

    private Long id;

    private RestaurantTableDTO table;

    private Boolean closed;
}
