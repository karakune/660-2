package com.A1.Webflix2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.A1.Webflix2.models.Movie;

@Controller
public class ResultController {

	@GetMapping("/result")
	public String result(Model model) {

        Movie movie1 = new Movie();
        movie1.id = 5;
        movie1.title = "Titenic";
        movie1.releaseYear = 1997;

        Movie movie2 = new Movie();
        movie2.id = 3;
        movie2.title = "Roadhouse";
        movie2.releaseYear = 2012;

        Movie[] movies = new Movie[] {movie1, movie2};

        model.addAttribute("movies", movies);
		return "result";
	}

}