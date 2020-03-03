package com.A1.Webflix2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

import com.A1.Webflix2.models.Actor;
import com.A1.Webflix2.models.Director;
import com.A1.Webflix2.models.Movie;
import com.A1.Webflix2.services.InventoryService;
import com.A1.Webflix2.services.MovieService;

@Controller
public class MovieDetailsController {

    @Autowired
    MovieService movieService;

    @Autowired
    InventoryService inventoryService;

	@GetMapping("/movieDetails")
	public String movieDetails(@RequestParam(name="id", required=false, defaultValue="-1") int id, Model model) {

        Movie movie = movieService.findById(id);
        model.addAttribute("movie", movie);

        int copiesCount = inventoryService.countByIdMovie(id);
        model.addAttribute("copiesCount", copiesCount);

        /*
        if (id == 5) {
            Movie movie = new Movie();

            movie.setId(5);
            movie.setTitle("Titenic");
            movie.setReleaseYear(1997);
            movie.setProductionCountries(Arrays.asList(new String[] {"Canada", "USA"}));
            movie.setOriginalLanguage("English");
            movie.setGenres(Arrays.asList(new String[] {"Drama", "Romance"}));
            
            Director d = new Director();
            d.setFirstName("Billie");
            d.setLastName("Eilish");
            movie.setDirector(d);

            Actor actor1 = new Actor();
            actor1.setId(20);
            actor1.setFirstName("Jean-Claude");
            actor1.setLastName("Van-Damme");
            actor1.setCharacter("Twilight Sparkle");
            Actor actor2 = new Actor();
            actor2.setId(16);
            actor2.setFirstName("Arnold");
            actor2.setLastName("Schwarzengger");
            actor2.setCharacter("The Boat");

            movie.setActors(Arrays.asList(new Actor[] {actor1, actor2}));
            movie.setLength(420);
            movie.setSummary("a clustercluck");
            movie.setPosterLink("http://google.com");
            movie.setTrailerLinks(Arrays.asList(new String[] {"http://yahoo.ca", "http://youtube.com"}));

            model.addAttribute("movie", movie);

        }
        */

        return "movieDetails";
    }

}