package com.A1.Webflix2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.A1.Webflix2.models.APerson;
import com.A1.Webflix2.services.APersonService;

@Controller
public class PersonDetailsController {

    @Autowired
    APersonService personService;

	@GetMapping("/personDetails")
    public String personDetails(@RequestParam(name="idMovie", required=false, defaultValue="-1") int idMovie, 
        @RequestParam(name="idPerson", required=false, defaultValue="-1") int idPerson, Model model) {
        model.addAttribute("idMovie", idMovie);

        APerson person = personService.findById(idPerson);
        model.addAttribute("person", person);
		return "personDetails";
	}

}