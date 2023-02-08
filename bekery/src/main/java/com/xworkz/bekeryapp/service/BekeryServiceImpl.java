package com.xworkz.bekeryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bekeryapp.dto.BekeryDTO;
import com.xworkz.bekeryapp.respository.BekeryRepository;

@Service
public class BekeryServiceImpl implements BekeryService{
	
	@Autowired
	private BekeryRepository bekeryRepository;

	public BekeryServiceImpl() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(BekeryDTO dto) {
		System.out.println("Running validateAndSave.....");
		boolean saved = this.bekeryRepository.save(dto);
		System.out.println("Saved in Repository "+saved);
		return false;
	}

	
}
