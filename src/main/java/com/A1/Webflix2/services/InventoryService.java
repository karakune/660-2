package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public int countByIdMovie(int idMovie) {
        return (int)inventoryRepository.countByMovieId(idMovie);
    }
}