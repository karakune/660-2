package com.A1.Webflix2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import com.A1.Webflix2.models.Movie;
import com.A1.Webflix2.services.MovieService;

@Controller
public class ResultController {
    
    @Autowired
    MovieService movieService;

	@GetMapping("/result")
	public String result(@RequestParam(name="title", required=false) String title, @RequestParam(name="language", required=false) String language, Model model) {

        List<Movie> movies = movieService.findAllByTitleAndOriginalLanguage(title, language);
        model.addAttribute("movies", movies);

        // Movie movie1 = new Movie();
        // movie1.setId(5);
        // movie1.setTitle("Titenic");
        // movie1.setReleaseYear(1997);

        // Movie movie2 = new Movie();
        // movie2.setId(3);
        // movie2.setTitle("Roadhouse");
        // movie2.setReleaseYear(2012);

        // Movie[] movies = new Movie[] {movie1, movie2};

        // model.addAttribute("movies", movies);
		return "result";
	}

}