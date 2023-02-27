package com.xworkz.icecream.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.icecream.dto.IceCreamDTO;

public interface IceCreamService {

	Set<ConstraintViolation<IceCreamDTO>> validateAndSave(IceCreamDTO dto);
	
	default IceCreamDTO findById(int id) {
		return null;
	}
}
