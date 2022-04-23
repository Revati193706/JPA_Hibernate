package com.tns.client;

import com.tns.entities.College; 
import com.tns.service.CollegeService;
import com.tns.service.CollegeServiceImpl; 
 
public class Client { 
 
 public static void main(String[] args) { 
 
CollegeService service = new CollegeServiceImpl();   
College clg = new College();     

// Create Operation  
clg.setCollegeId(1); 
clg.setName("Narahari"); 
service.addCollege(clg);

//at this breakpoint, we have added one record to table   // Retrieve Operation   student = service.findStudentById(100);   System.out.print("ID:"+student.getStudentId());   System.out.println(" Name:"+student.getName());        
 
  // Update Operation   student = service.findStudentById(100);   student.setName("Sachin Tendulkar");   service.updateStudent(student);    //at this breakpoint, we have updated record added in first section      student = service.findStudentById(100);   System.out.print("ID:"+student.getStudentId());   System.out.println(" Name:"+student.getName());          //at this breakpoint, record is removed from table   // Delete Operation   student = service.findStudentById(100);   service.removeStudent(student);  System.out.println("End of program/Life cycle completed...");  
	 }   
}