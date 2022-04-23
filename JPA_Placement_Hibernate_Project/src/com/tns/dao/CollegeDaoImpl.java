package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.College;

public class CollegeDaoImpl implements CollegeDao

{

	private EntityManager entityManager;
	
	
	public CollegeDaoImpl() 
	
	{
		
entityManager=JPAUtil.getEntityManager();
		
	}

	@Override
	public College getCollegeById(int clgID) 
	
	{
	
		College clg=entityManager.find(College.class,clgID);
		return clg;
		
	}

	@Override
	public void addCollege(College clg) 
	
	{
		
		entityManager.persist(clg);
		
	}

	@Override
	public void removeCollege(College clg)
	
	{
	
		entityManager.remove(clg);
		
	}

	@Override
	public void updateCollege(College clg) 
	
	{
	
		entityManager.merge(clg);
		
	}

	@Override
	public void commitTransaction() 
	
	{
		
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() 
	
	{
		
		entityManager.getTransaction().begin();
		
	}

}
