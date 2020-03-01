package com.A1.Webflix2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.A1.Webflix2.models.APerson;
import com.A1.Webflix2.models.Actor;
import java.sql.Date;

@Controller
public class RentConfirmedController {

	@GetMapping("/rentConfirmed")
    public String personDetails(@RequestParam(name="idMovie", required=false, defaultValue="-1") int idMovie, Model model) {
        model.addAttribute("idMovie", idMovie);
        boolean canRent = false;
        
        // Find a copy of the movie with the id
        // Set that copy as rented
        // Add a location to the client's rented list

        model.addAttribute("canRent", canRent);
		return "rentConfirmed";
	}

}