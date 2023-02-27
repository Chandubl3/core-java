package com.xworkz.icecream.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.icecream.entity.IceCreamEntity;

@Repository
public class IceCreamRepositoryImpl implements IceCreamRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean save(IceCreamEntity iceCreamEntity) {
		System.out.println("Running save is IceCreamRepositoryImpl.....");
		
		EntityManager manger = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		manger.persist(iceCreamEntity);
		transaction.commit();
		manger.close();
		
		return true;
	}
	
	@Override
	public IceCreamEntity find(int id) {
		System.out.println("find(int id) in repoImpl"+id);
		EntityManager manager =this.entityManagerFactory.createEntityManager();
		IceCreamEntity fromDb = manager.find(IceCreamEntity.class, id);
		manager.close();
		return fromDb;
	}

}
