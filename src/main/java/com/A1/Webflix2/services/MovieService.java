package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.A1.Webflix2.models.Movie;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // public List<Movie> list() {
    //     return movieRepository.findAll();
    // }

    public List<Movie> findAllByTitleAndOriginalLanguage(String title, String originalLanguage) {
        return movieRepository.findAllByTitleAndOriginalLanguage(title, originalLanguage);
    }

    public Movie findById(int id) {
        Optional<Movie> optionalEntity =  movieRepository.findById(id);
        Movie movieEntity = optionalEntity.get();
        return movieEntity;
    }
}