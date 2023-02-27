package com.xworkz.icecream.repository;

import com.xworkz.icecream.entity.IceCreamEntity;

public interface IceCreamRepository {

	boolean save (IceCreamEntity iceCreamEntity);
	
	default IceCreamEntity find(int id) {
		return null;
	}
}
