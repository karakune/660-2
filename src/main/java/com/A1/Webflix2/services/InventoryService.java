package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.A1.Webflix2.models.Inventory;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository InventoryRepository;

    public List<Inventory> list() {
        return InventoryRepository.findAll();
    }
}