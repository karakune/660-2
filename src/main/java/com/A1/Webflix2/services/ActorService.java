package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.ActorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.A1.Webflix2.models.Actor;

@Service
public class ActorService {

    @Autowired
    private ActorRepository ActorRepository;

    public List<Actor> list() {
        return ActorRepository.findAll();
    }
}