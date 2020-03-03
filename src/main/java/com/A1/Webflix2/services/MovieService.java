package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.A1.Webflix2.models.Movie;

@Service
public class MovieService {

    @Autowired
    private MovieRepository MovieRepository;

    public List<Movie> list() {
        return MovieRepository.findAll();
    }
}