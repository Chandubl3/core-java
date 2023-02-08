package com.xworkz.bekeryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bekeryapp.dto.BekeryDTO;
import com.xworkz.bekeryapp.service.BekeryService;

@Controller
@RequestMapping("/bekery")
public class BekeryController {

	@Autowired
	private BekeryService bekeryService;
	
	public BekeryController() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBekery(BekeryDTO bekeryDTO, Model model) {
		System.out.println("Running onBekery....."+bekeryDTO);
		model.addAttribute("bekeryName", bekeryDTO.getBekeryName());
		model.addAttribute("ownerName", bekeryDTO.getOwnerName());
		model.addAttribute("married", bekeryDTO.isMarried());
		model.addAttribute("ownerWifeName", bekeryDTO.getOwnerWifeName());
		model.addAttribute("famouaIn", bekeryDTO.getFamouaIn());
		model.addAttribute("scine", bekeryDTO.getScine());
		return "DisplaySuccess";
	}
}
