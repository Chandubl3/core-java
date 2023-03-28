package com.xworkz.icecream.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;

public interface IceCreamRepository {

	boolean save (IceCreamEntity iceCreamEntity);
	
	boolean update (IceCreamEntity iceCreamEntity);
	
	default IceCreamEntity find(int id) {
		return null;
	}
	
	default List<IceCreamEntity> findByBrandName(String brandName){
		return Collections.emptyList();
	}
	
	default IceCreamEntity deleteById(int id) {
		return null;
	}
	
	default List<IceCreamEntity> findByNameAndPrice(String name, double price){
		return Collections.emptyList();
	}
	
	default List<IceCreamEntity> findAll(){
		return Collections.emptyList();
	}
	
}