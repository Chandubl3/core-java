package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/khara")
public class PickleComponent {

	public PickleComponent() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String taste() {
		System.out.println("Running taste...");
		return "Pickle.jsp";
	}
}
