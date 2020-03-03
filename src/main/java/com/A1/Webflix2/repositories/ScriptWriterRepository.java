package com.A1.Webflix2.repositories;

import com.A1.Webflix2.models.ScriptWriter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScriptWriterRepository extends JpaRepository<ScriptWriter, Integer> {
    
}