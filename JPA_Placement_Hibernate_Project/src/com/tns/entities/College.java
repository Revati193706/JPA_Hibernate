package com.tns.entities; 

 import java.io.Serializable; 
 import javax.persistence.Entity;
 import javax.persistence.Id; 
 import javax.persistence.Table; 
 
 @Entity
 @Table(name="college")
 
 public class College implements Serializable 
 
 {   
	 
	 private static final long serialVersionUID = 1L;  
	 @Id  private int clgID;    
	 private String clgName;     
	 
	 public int getCollegeId()
	 
	 {
		
		 return clgID; 
		 
	 }	 
 
 
 public void setCollegeId(int clgID) 
 {
	 
	 this.clgID = clgID;
	 
 }
 
 public String getName()
 
 {  
	 
	 return clgName;  
	 
 } 
 
 public void setName(String clgName)
 
 {
	 
	 this.clgName = clgName; 
	 
 }
 
 }