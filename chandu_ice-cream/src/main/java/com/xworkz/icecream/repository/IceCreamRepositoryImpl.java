package com.xworkz.icecream.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.icecream.entity.IceCreamEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class IceCreamRepositoryImpl implements IceCreamRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean save(IceCreamEntity iceCreamEntity) {
		log.info("Running save is IceCreamRepositoryImpl.....");
		
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
		log.info("find(int id) in repoImpl"+id);
		EntityManager manager =this.entityManagerFactory.createEntityManager();
		IceCreamEntity fromDb = manager.find(IceCreamEntity.class, id);
		manager.close();
		return fromDb;
	}
	
	@Override
	public List<IceCreamEntity> findByBrandName(String brandName) {
	
		EntityManager man = this.entityManagerFactory.createEntityManager();
		
		try {
			Query query = man.createNamedQuery("findByBrandName");
			query.setParameter("bn", brandName);
			List<IceCreamEntity> list = query.getResultList();
			log.info("Total list found in repo" +list.size());
			return list;
			
		} finally {
			man.close();
		}
		
	}

	@Override
	public boolean update(IceCreamEntity iceCreamEntity) {
		EntityManager manger = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manger.getTransaction();
			transaction.begin();
			manger.merge(iceCreamEntity);
			transaction.commit();
			return true;
		} finally {
			manger.close();
		}
	}
	
	@Override
	public IceCreamEntity deleteById(int id) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			IceCreamEntity manager2 = manager.find(IceCreamEntity.class, id);
			transaction.begin();
			manager.remove(manager2);
			transaction.commit();
			return manager2;
		} finally {
			manager.close();
		}
	}
	
	@Override
	public List<IceCreamEntity> findByNameAndPrice(String name, double price) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		
		try {
			Query query = manager.createNamedQuery("findByNameAndPrice");
			query.setParameter("nm", name);
			query.setParameter("pr", price);
			List<IceCreamEntity> list = query.getResultList();
			log.info("Total list found in repo" +list.size());
			return list;
		} finally {
			manager.close();
		}
	}
	
	@Override 
	public List<IceCreamEntity> findAll() {
		log.info("findAll in repoImpl"); 
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try { 
			Query query = manager.createNamedQuery("findAll"); 
			List<IceCreamEntity> list = query.getResultList();
			log.info("Total list found in repo" +list.size()); 
			return list;
		} finally { 
		 manager.close(); 
		} 
	}
}
