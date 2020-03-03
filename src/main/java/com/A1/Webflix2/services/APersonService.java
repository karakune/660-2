package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.APersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.A1.Webflix2.models.APerson;

@Service
public class APersonService {

    @Autowired
    private APersonRepository APersonRepository;

    public List<APerson> list() {
        return APersonRepository.findAll();
    }

    public APerson findById(int id) {
        Optional<APerson> optionalEntity =  APersonRepository.findById(id);
        APerson personEntity = optionalEntity.get();
        return personEntity;
    }
}