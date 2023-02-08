package com.xworkz.bekeryapp.respository;

import org.springframework.stereotype.Repository;

import com.xworkz.bekeryapp.dto.BekeryDTO;

@Repository
public class BekeryRepositoryImpl implements BekeryRepository{

	public BekeryRepositoryImpl() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BekeryDTO bekeryDTO) {
		System.out.println("Running save......");
		return false;
	}

}
