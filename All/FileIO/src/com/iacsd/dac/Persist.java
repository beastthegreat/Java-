package com.iacsd.dac;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist 
{
	 public static void main(String args[])throws Exception
	 {  
	  Student s1 =new Student(101,"Saurabh","Pune",50000,"PG-DAC");  
	  Student s2 =new Student(102,"Nil","Hinjawadi",50000,"PG-DAC");  
	  Student s3 =new Student(103,"Megha","Sangali",50000,"PG-DAC");  
	  Student s4 =new Student(104,"Teju","Pune",50000,"PG-DAC");  
	  
	  FileOutputStream fout=new FileOutputStream("serealized.txt");  
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
