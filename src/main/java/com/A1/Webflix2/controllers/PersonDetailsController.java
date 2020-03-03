package com.A1.Webflix2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.A1.Webflix2.models.APerson;
import com.A1.Webflix2.models.Actor;
import java.sql.Date;

@Controller
public class PersonDetailsController {

	@GetMapping("/personDetails")
    public String personDetails(@RequestParam(name="idMovie", required=false, defaultValue="-1") int idMovie, 
        @RequestParam(name="idPerson", required=false, defaultValue="-1") int idPerson, Model model) {
        model.addAttribute("idMovie", idMovie);
        if (idPerson == 20) {
            APerson person = new Actor();
            // person.firstName = "Jean-Claude";
            // person.lastName = "Van-Damme";
            // person.birthDate = new Date(199944000000L);

            model.addAttribute("person", person);
        }
		return "personDetails";
	}

}