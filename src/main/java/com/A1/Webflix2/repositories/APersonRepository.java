package com.A1.Webflix2.repositories;

import com.A1.Webflix2.models.APerson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface APersonRepository extends JpaRepository<APerson, Integer> {
    
}