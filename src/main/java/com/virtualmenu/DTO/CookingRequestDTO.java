package com.virtualmenu.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CookingRequestDTO {

    private Long id;

    private ProductDTO product;

    private ShoppingCartDTO shoppingCart;

    private Boolean isCooking;
}
