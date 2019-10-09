package com.virtualmenu.controller;

import com.virtualmenu.DTO.ShoppingCartDTO;
import com.virtualmenu.mapper.ShoppingCartMapper;
import com.virtualmenu.model.ShoppingCart;
import com.virtualmenu.service.ShoppingCartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/shopping-carts")
@RestController
public class ShoppingCartController extends RESTController<ShoppingCart, Long, ShoppingCartDTO> {

    private static final ShoppingCartMapper shoppingCartMapper = new ShoppingCartMapper();
    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        super(shoppingCartService, shoppingCartMapper);
        this.shoppingCartService = shoppingCartService;
    }

}
