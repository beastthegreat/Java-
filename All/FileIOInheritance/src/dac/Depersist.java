package dac;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("myfile.txt"));
	    Student s1 = null;
		try {
			s1 = (Student) in.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s1.id+"   "+s1.name+"  "+s1.address+"   "+s1.fees+"   "+s1.Course); 
		
		in.close(); 

	}

}
