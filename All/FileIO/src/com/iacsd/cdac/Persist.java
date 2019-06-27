package com.iacsd.cdac;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist 
{
	public static void main3(String args[])throws Exception
	 {  
	  Student s1 =new Student(101,"Saurabh","Pune","PG-DAC");  
	  Student s2 =new Student(102,"Nil","Hinjawadi","PG-DAC");  
	  Student s3 =new Student(103,"Megha","Sangali","PG-DAC");  
	  Student s4 =new Student(104,"Teju","Pune","PG-DAC");  
	  
	  FileOutputStream fout=new FileOutputStream("f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  
	  out.writeObject(s1); 
	  out.writeObject(s2);
	  out.writeObject(s3);
	  out.writeObject(s4);
	  out.flush();  
	  System.out.println("Data written Successfull...");
	  System.out.println("\nSee f.txt File...!!!");
	  
	  out.close();
	  
	 }  

}
