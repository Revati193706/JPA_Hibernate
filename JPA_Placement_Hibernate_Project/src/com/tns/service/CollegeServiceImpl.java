package com.tns.service;

import com.tns.entities.*;
import com.tns.dao.*;

public class CollegeServiceImpl implements CollegeService{

	private CollegeDao dao;
	
	
	public CollegeServiceImpl()
	
	{
	
		dao=new CollegeDaoImpl();
		
	}

	@Override
	public College findCollegeById(int clgID) {
	
		College clg=dao.getCollegeById(clgID);
		return clg;
	
	}

	@Override
	public void addCollege(College clg)
	
	{
		
	dao.beginTransaction();
	dao.addCollege(clg);
	dao.commitTransaction();
	
	}

	@Override
	public void removeCollege(College clg) 
	
	{
		
		dao.beginTransaction();
		dao.removeCollege(clg);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCollege(College clg) {
		
		dao.beginTransaction();
		dao.updateCollege(clg);
		dao.commitTransaction();
		
	}

}
