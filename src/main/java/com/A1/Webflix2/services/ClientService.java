package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.A1.Webflix2.models.Client;
import com.A1.Webflix2.models.Location;

@Service
public class ClientService {

    @Autowired
    private ClientRepository ClientRepository;

    public List<Client> list() {
        return ClientRepository.findAll();
    }

    public Client findById(int id) {
        Optional<Client> optionalEntity =  ClientRepository.findById(id);
        Client clientEntity = optionalEntity.get();
        return clientEntity;
    }

    public List<Location> getLocationsforClient(int clientId) {
        Optional<Client> optionalEntity =  ClientRepository.findById(clientId);
        Client clientEntity = optionalEntity.get();
        return clientEntity.getLocations();
    }

    public boolean canClientLoan(int clientId) {
        return getLocationsforClient(clientId).size() < 2;
    }
}