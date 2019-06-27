package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class coinMainApplication 
{
	static String countryToSearch;
	static int mintyear;
	 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int choice;
		ArrayList<coinCollection> coins = new ArrayList(); //coins
		coinCollection obj3=new coinCollection("India","Rupee",1970,10,1998);
		coins.add(obj3);		
		do
		{
			System.out.println("1.Add coins in collection..");
			System.out.println("2.Display details");
			System.out.println("3.Search by country");
			System.out.println("4.search by miniting year..");			
			System.out.println("Enter the choice...");
			choice=sc.nextInt();			
			switch(choice)
			{
			case 1:
				coinCollection obj=new coinCollection();
				obj.addCoins();
				coins.add(obj);
				break;
			case 2:
				Iterator<coinCollection> i = coins.iterator();
				while(i.hasNext())
				{
					coinCollection c = i.next();
					c.display();
				}
				break;
			case 3:
				System.out.println("Enter Country : ");
				countryToSearch=sc.next();
				Iterator<coinCollection> j = coins.iterator();
				while(j.hasNext())
				{
					coinCollection c = j.next();
					if(countryToSearch.equals(c.getCountry()))
					{
						c.display();
					}
				}
				break;
			case 4:
				System.out.println("Enter miniting year.. : ");
				mintyear=sc.nextInt();
				Iterator<coinCollection> k = coins.iterator();
				while(k.hasNext())
				{
					coinCollection c = k.next();
					if(mintyear == c.getMintingyear())
					{
						c.display();
					}
				}
				break;
				default:System.out.println("Not found...");
					
			}
		}while(choice!=4);
	}
}