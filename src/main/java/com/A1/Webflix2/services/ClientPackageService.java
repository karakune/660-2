package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.ClientPackageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.A1.Webflix2.models.ClientPackage;

@Service
public class ClientPackageService {

    @Autowired
    private ClientPackageRepository clientPackageRepository;

    public List<ClientPackage> list() {
        return clientPackageRepository.findAll();
    }
}