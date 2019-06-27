package dac;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist 
{
	public static void main2(String[] args) throws IOException, ClassNotFoundException 
	{
	
		Student s=new Student(1, "Nilima","Pune",10000,"PG-DAC");
				
		FileOutputStream fout=new FileOutputStream("myfile.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
				
		out.writeObject(s);
		
		 out.flush();  
		 System.out.println("Data written Successfull...");
		 System.out.println("\nSee f.txt File...!!!");
		  
		out.close();
			 
		
	}

}
