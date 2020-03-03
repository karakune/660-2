package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.DirectorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.A1.Webflix2.models.Director;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository DirectorRepository;

    public List<Director> list() {
        return DirectorRepository.findAll();
    }
}