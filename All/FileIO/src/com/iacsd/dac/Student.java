package com.iacsd.dac;

public class Student extends Person
{
	 int fees;
	 String Course;
	 
	public Student(int id, String name, String address, int fees, String course) 
	{
		super(id, name, address);
		this.fees = fees;
		Course = course;
	}  
	 
	 
}
