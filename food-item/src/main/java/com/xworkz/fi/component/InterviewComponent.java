package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fi.dto.InterviewDTO;

@Component
@RequestMapping("/Attend")
public class InterviewComponent {

	public InterviewComponent() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onAttend(InterviewDTO dto) {
		System.out.println("Running onAttend.....");
		System.out.println("DTO is :" +dto);
		return "Interview.jsp";
	}
}
