package com.tns.service;

import com.tns.*;
import com.tns.entities.College;

public interface CollegeService

{

	public abstract College findCollegeById(int clgID);
	public abstract void addCollege(College clg);
	public abstract void removeCollege(College clg);
	public abstract void updateCollege(College clg);
	
}
