package com.xworkz.goaapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goaapp.dto.CasinoDTO;

@Component
@RequestMapping("/Casino")
public class CasinoController {

	public CasinoController() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCasino(CasinoDTO dto, Model model ) {
		System.out.println("Running onCasino...." +dto);
		 model.addAttribute("Name", dto.getName()); 
		 model.addAttribute("Cruise",dto.getCruise());
		 model.addAttribute("EntryFee", dto.getEntryFee());
		//model.addAttribute("FreeFood", dto.g);
		//model.addAttribute("Name", dto.getName());
		return "CasinoSuccess.jsp";
	}
}
