package com.tns.dao;

import javax.persistence.*;
import com.tns.entities.*;

public interface CollegeDao

{
	
	public abstract College getCollegeById(int clgID);
	public abstract void addCollege(College clg);
	public abstract void removeCollege(College clg);
	public abstract void updateCollege(College clg);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
}
