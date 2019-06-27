package com.iacsd.cdac;

import java.io.Serializable;

public class Student implements Serializable 
{
	 int id;  
	 String name,address;
	 transient String Course;  
	 
	 public Student(int id, String name,String address,String Course) 
	 {  
	  this.id = id;  
	  this.name = name;  
	  this.address=address;
	  this.Course=Course;

	 }
}
