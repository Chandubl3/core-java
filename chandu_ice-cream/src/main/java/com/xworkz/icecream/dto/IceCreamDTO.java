package com.xworkz.icecream.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IceCreamDTO {

	private int id;
	@NotBlank(message = "Place should be selected")
	private String name;
	
	@Size(min = 3, max = 20, message = "BrandName cannot be less than 3 or more than 20 characters")
	private String brandName;
	
	@NotBlank(message = "Place should be selected")
	private String color;
	
	@NotBlank(message = "Place should be selected")
	private String type;
	
	@NotNull(message = "Price shouldn't be null")
	private double price;
}
