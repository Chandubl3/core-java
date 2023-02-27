package com.xworkz.icecream.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.icecream.dto.IceCreamDTO;
import com.xworkz.icecream.service.IceCreamService;

@Controller
@RequestMapping("/")
public class IceCreamController {

	@Autowired
	private IceCreamService iceCreamService;

	private List<String> name = Arrays.asList("Chocolate", "Butterscotch", "Vanilla", "Strawberry", "Mango", "Pista");
	private List<String> color = Arrays.asList("Brown", "Cream", "White", "Pink", "Yellow", "Green");
	private List<String> type = Arrays.asList("Cone", "Cup", "Candy", "Kulfi", "FamilyPack");

	public IceCreamController() {
		System.out.println("Create " + this.getClass().getSimpleName());
	}

	@GetMapping("/icecream")
	public String onIceCream(Model model) {

		model.addAttribute("name", name);
		model.addAttribute("color", color);
		model.addAttribute("type", type);

		return "Select";
	}

	@PostMapping("/icecream")
	public String onIceCream(Model model, IceCreamDTO dto) {
		System.out.println("Running onIceCream Post Method" + dto);
		Set<ConstraintViolation<IceCreamDTO>> violation = iceCreamService.validateAndSave(dto);
		if (violation.isEmpty()) {
			System.out.println("no violation in controller go to success page");
			model.addAttribute("dto", dto);
			return "SelectSuccess";
		}
		model.addAttribute("dto", dto);
		model.addAttribute("name", name);
		model.addAttribute("color", color);
		model.addAttribute("type", type);
		model.addAttribute("error", violation);
		System.out.println("violation in controller");
		return "Select";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id" + id);
		IceCreamDTO dto = this.iceCreamService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "Search";
	}
}
