package com.A1.Webflix2.repositories;

import com.A1.Webflix2.models.ClientPackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientPackageRepository extends JpaRepository<ClientPackage, Integer> {
    
}