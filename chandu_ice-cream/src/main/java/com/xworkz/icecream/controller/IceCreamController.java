package com.xworkz.icecream.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.icecream.dto.IceCreamDTO;
import com.xworkz.icecream.service.IceCreamService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class IceCreamController {

	@Autowired
	private IceCreamService iceCreamService;

	private List<String> name = Arrays.asList("Chocolate", "Butterscotch", "Vanilla", "Strawberry", "Mango", "Pista");
	private List<String> color = Arrays.asList("Brown", "Cream", "White", "Pink", "Yellow", "Green");
	private List<String> type = Arrays.asList("Cone", "Cup", "Candy", "Kulfi", "FamilyPack");

	public IceCreamController() {
		log.info("Create " + this.getClass().getSimpleName());
	}

	@GetMapping("/icecream")
	public String onIceCream(Model model) {

		model.addAttribute("name", name);
		model.addAttribute("color", color);
		model.addAttribute("type", type);

		return "Save";
	}

	@PostMapping("/icecream")
	public String onIceCream(Model model, IceCreamDTO dto) {
		log.info("Running onIceCream Post Method" + dto);
		Set<ConstraintViolation<IceCreamDTO>> violation = iceCreamService.validateAndSave(dto);
		if (violation.isEmpty()) {
			log.info("no violation in controller go to success page");
			model.addAttribute("dto", dto);
			return "SaveSuccess";
		}
		model.addAttribute("dto", dto);
		model.addAttribute("name", name);
		model.addAttribute("color", color);
		model.addAttribute("type", type);
		model.addAttribute("error", violation);
		log.info("violation in controller");
		return "Save";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		log.info("Running on search for id" + id);
		IceCreamDTO dto = this.iceCreamService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "Search";
	}
	
	@GetMapping("/searchbybrandname")
	public String onSearchByBrandName(@RequestParam String brandName, Model model) {
		log.info("Running on search by BrandName" +brandName);
		List<IceCreamDTO> list = this.iceCreamService.findByBrandName(brandName);
		if (list != null && !list.isEmpty()) {
			log.info("Printing list...");
			model.addAttribute("list", list);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "BrandNameSearch";
	}
	
	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		log.info("Running onUpdate" +id);
		IceCreamDTO dto = this.iceCreamService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("name", name);
		model.addAttribute("color", color);
		model.addAttribute("type", type);
		return "Updated";
	}
	
	@PostMapping("/update")
	public String onUpdate(IceCreamDTO dto, Model model) {
		log.info("Running onUpdate Post Method" + dto);
		Set<ConstraintViolation<IceCreamDTO>> violation = iceCreamService.validateAndUpdate(dto);
		if(violation.size()>0) {
			model.addAttribute("errors", violation);
		}else {
			model.addAttribute("message", "Updated Successfully........");
		}
		return "Updated";
	}
	
	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		log.info("Running on delete in post ");
		IceCreamDTO dto = this.iceCreamService.deleteById(id);
		if (dto != null) {
			model.addAttribute("delete", dto);
			return "Deleted";
		} else {
			model.addAttribute("message3", "Data not found");
			return "Updated";
		}
	}
	
	@GetMapping("/searchbynameandprice")
	public String onSearchByNameAndPrice(@RequestParam String name, @RequestParam Double price, Model model) {
		log.info("Running on search by Name and Price" +name +price);
		List<IceCreamDTO> list = this.iceCreamService.findByNameAndPrice(name, price);
		if (list != null && !list.isEmpty()) {
			log.info("Printing list...");
			model.addAttribute("list", list);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "NameAndPriceSearch";
	}
	
	@GetMapping("/searchall") 
	public String onSearchAll(Model model) { 
		log.info("Running on search by All"); 
		List<IceCreamDTO>list = this.iceCreamService.findAll(); 
		if (list != null && !list.isEmpty()) {
			log.info("Printing list..."); 
			model.addAttribute("list", list); 
		}else { 
		 model.addAttribute("message", "Data not found"); 
		} 
		return "SearchAll";
	}
	
}
