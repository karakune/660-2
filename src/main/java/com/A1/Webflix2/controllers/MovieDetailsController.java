package com.A1.Webflix2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.A1.Webflix2.models.Actor;
import com.A1.Webflix2.models.Director;
import com.A1.Webflix2.models.Movie;

@Controller
public class MovieDetailsController {

	@GetMapping("/movieDetails")
	public String movieDetails(@RequestParam(name="id", required=false, defaultValue="-1") int id, Model model) {
        if (id == 5) {
            Movie movie = new Movie();

            movie.id = 5;
            movie.title = "Titenic";
            movie.releaseYear = 1997;
            movie.productionCountries = new String[] {"Canada", "USA"};
            movie.originalLanguage = "English";
            movie.genres = new String[] {"Drama", "Romance"};
            
            Director d = new Director();
            d.firstName = "Billie";
            d.lastName = "Eilish";
            movie.director = d;

            Actor actor1 = new Actor();
            actor1.id = 20;
            actor1.firstName = "Jean-Claude";
            actor1.lastName = "Van-Damme";
            actor1.character = "Twilight Sparkle";
            Actor actor2 = new Actor();
            actor2.id = 16;
            actor2.firstName = "Arnold";
            actor2.lastName = "Schwarzengger";
            actor2.character = "The Boat";

            movie.actors = new Actor[] {actor1, actor2};
            movie.length = 420;
            movie.summary = "a clustercluck";
            movie.posterLink = "http://google.com";
            movie.trailerLinks = new String[] {"http://yahoo.ca", "http://youtube.com"};

            model.addAttribute("movie", movie);
        }
		return "movieDetails";
    }

}