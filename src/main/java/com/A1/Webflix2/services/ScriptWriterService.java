package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.ScriptWriterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.A1.Webflix2.models.ScriptWriter;

@Service
public class ScriptWriterService {

    @Autowired
    private ScriptWriterRepository ScriptWriterRepository;

    public List<ScriptWriter> list() {
        return ScriptWriterRepository.findAll();
    }
}