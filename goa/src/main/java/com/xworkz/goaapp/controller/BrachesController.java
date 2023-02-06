package com.xworkz.goaapp.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.goaapp.dto.BeachesDTO;

@Component
@ComponentScan("/Beaches")
public class BrachesController {

	public BrachesController() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBeaches(BeachesDTO dto, Model model ) {
		System.out.println("Running onCasino...." +dto);
		 model.addAttribute("Name", dto.getName()); 
		 model.addAttribute("Location",dto.getLocation());
		 model.addAttribute("Clean", dto.getClean());
		 model.addAttribute("Games", dto.getGames());
		return "Braches.jsp";
	}
}
