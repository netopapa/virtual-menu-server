package com.virtualmenu.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RestaurantTableDTO {

    private Long id;

    private Integer number;

    private Boolean busy;
}
