package com.xworkz.soldier.repositry;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepositryImpl {
	
	public SoldierRepositryImpl() {
		System.out.println(" created SoliderRepoImpl using no-org const...");
	}
	public boolean save(SoldierDTO dto) {
		System.out.println("running save");
		System.out.println("DTO"+dto);
		return false;
		
	}


}
