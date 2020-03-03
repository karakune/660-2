// package com.A1.Webflix2.controllers;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// import com.A1.Webflix2.models.Movie;

// @Controller
// public class SearchController {

// 	@GetMapping("/result")
// 	public String result(Model model) {

//         Movie movie1 = new Movie();
//         movie1.setId(5);
//         movie1.setTitle("Titenic");
//         movie1.setReleaseYear(1997);

//         Movie movie2 = new Movie();
//         movie2.setId(3);
//         movie2.setTitle("Roadhouse");
//         movie2.setReleaseYear(2012);

//         Movie[] movies = new Movie[] {movie1, movie2};

//         model.addAttribute("movies", movies);
// 		return "result";
// 	}

// }