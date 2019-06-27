package dac;

import java.io.Serializable;

public class Person implements Serializable 
{
	int id;  
	String name,address;
	
	public Person(int id, String name, String address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
}
