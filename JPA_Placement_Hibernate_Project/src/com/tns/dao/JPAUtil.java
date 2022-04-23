package com.tns.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 

{

	private static EntityManager entityManager;
	private static EntityManagerFactory factory;
	
	static
	
	{
		
	factory=Persistence.createEntityManagerFactory("JPA-PU");
	
	}
	
	public static EntityManager getEntityManager()
	
	{
	
		if(entityManager==null||!entityManager.isOpen())
			
		{
			entityManager=factory.createEntityManager();
		}
		
		return entityManager;
		
	}
	
}
