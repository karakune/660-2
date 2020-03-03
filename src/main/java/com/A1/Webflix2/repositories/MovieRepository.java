package com.A1.Webflix2.repositories;

import java.util.List;

import com.A1.Webflix2.models.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    public List<Movie> findAllByTitleAndOriginalLanguage(String title, String originalLanguage);
}