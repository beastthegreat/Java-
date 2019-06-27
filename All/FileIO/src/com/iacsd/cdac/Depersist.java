package com.iacsd.cdac;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist 
{
	public static void main4(String args[])throws Exception{  
	    
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		  
		  
		  Student s1=(Student)in.readObject();  
		  System.out.println(s1.id+" "+s1.name+"  "+s1.address+"  "+s1.Course); 
		  
		  Student s2=(Student)in.readObject();  
		  System.out.println(s2.id+" "+s2.name+"  "+s2.address+"  "+s2.Course); 
		  
		  Student s3=(Student)in.readObject();  
		  System.out.println(s3.id+" "+s3.name+"  "+s3.address+"  "+s3.Course); 
		  
		  Student s4=(Student)in.readObject();  
		  System.out.println(s4.id+" "+s4.name+"  "+s4.address+"  "+s4.Course); 
		  
		  in.close();  
		 }  

}
