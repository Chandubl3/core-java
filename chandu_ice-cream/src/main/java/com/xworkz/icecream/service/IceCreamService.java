package com.xworkz.icecream.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.icecream.dto.IceCreamDTO;

public interface IceCreamService {

	Set<ConstraintViolation<IceCreamDTO>> validateAndSave(IceCreamDTO dto);
	
	default IceCreamDTO findById(int id) {
		return null;
	}
	
	default List<IceCreamDTO> findByBrandName(String brandName){
		return Collections.emptyList();
	}
	
	Set<ConstraintViolation<IceCreamDTO>> validateAndUpdate(IceCreamDTO dto);
	
	default IceCreamDTO deleteById(int id) {
		return null;
	}
	
	default List<IceCreamDTO> findByNameAndPrice(String name, double price){
		return Collections.emptyList();
	}
	
	default List<IceCreamDTO> findAll(){
		return Collections.emptyList();
	}
}
