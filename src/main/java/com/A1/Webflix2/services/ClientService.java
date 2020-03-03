package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.A1.Webflix2.models.Client;

@Service
public class ClientService {

    @Autowired
    private ClientRepository ClientRepository;

    public List<Client> list() {
        return ClientRepository.findAll();
    }
}