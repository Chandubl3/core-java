package com.xworkz.soldier.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditoDTO{
	
	@NonNull
	@NotBlank
	@Size(min=3,max=20)
	
	private String name;
	private int id;
	private String rank;
	private String batallion;
	private String country;
	


}
