package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repositry.SoldierRepositry;
import com.xworkz.soldier.repositry.SoldierRepositryImpl;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {
	
	private static final SoldierRepositry repositry = null;

	public static void main(String[] args) {
		SoldierDTO dto = new SoldierDTO("Akshara",1,"Topper","xworkz","banglore");
		
		SoldierServiceImpl ser= new SoldierServiceImpl();
		SoldierRepositryImpl repo= new SoldierRepositryImpl();
		ser.setSoliderRepositry((SoldierRepositry) repositry);
		ser.validateAndsave(dto);
	}


}
