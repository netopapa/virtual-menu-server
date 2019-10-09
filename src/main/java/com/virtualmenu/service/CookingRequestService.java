package com.virtualmenu.service;

import com.virtualmenu.model.CookingRequest;
import com.virtualmenu.repository.BaseRepository;
import com.virtualmenu.repository.CookingRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CookingRequestService extends GenericService<CookingRequest, Long> {

    private CookingRequestRepository cookingRequestRepository;

    @Autowired
    public CookingRequestService(
            BaseRepository<CookingRequest, Long> repository,
            CookingRequestRepository cookingRequestRepository
    ) {
        super(repository);
        this.cookingRequestRepository = cookingRequestRepository;
    }

}
