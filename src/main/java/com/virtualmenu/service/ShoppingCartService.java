package com.virtualmenu.service;

import com.virtualmenu.model.ShoppingCart;
import com.virtualmenu.repository.BaseRepository;
import com.virtualmenu.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService extends GenericService<ShoppingCart, Long> {

    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    public ShoppingCartService(
            BaseRepository<ShoppingCart, Long> repository,
            ShoppingCartRepository shoppingCartRepository
    ) {
        super(repository);
        this.shoppingCartRepository = shoppingCartRepository;
    }

}
