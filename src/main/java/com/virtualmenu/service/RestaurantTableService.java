package com.virtualmenu.service;

import com.virtualmenu.model.RestaurantTable;
import com.virtualmenu.repository.BaseRepository;
import com.virtualmenu.repository.RestaurantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantTableService extends GenericService<RestaurantTable, Long> {

    private RestaurantTableRepository restaurantTableRepository;

    @Autowired
    public RestaurantTableService(
            BaseRepository<RestaurantTable, Long> repository,
            RestaurantTableRepository restaurantTableRepository
    ) {
        super(repository);
        this.restaurantTableRepository = restaurantTableRepository;
    }

}
