package com.A1.Webflix2.repositories;

import com.A1.Webflix2.models.Inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    long countByMovieId(int movieId);
}