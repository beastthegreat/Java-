package collection;

import java.util.Date;
import java.util.Scanner;

public class coinCollection implements coins 
{
	private String country;
	private String denomination;
	private int mintingyear;
	private int currentVaue;
	private int acquiredDate;
	
	Scanner sc = new Scanner(System.in);
	public coinCollection()
	{
		this.country = null;
		this.denomination = null;
		this.mintingyear = 0;
		this.currentVaue = 0;
		this.acquiredDate = 0;
	}
	public coinCollection(String country, String denomination, int mintingyear, int currentVaue, int acquiredDate) 
	{
		super();
		this.country = country;
		this.denomination = denomination;
		this.mintingyear = mintingyear;
		this.currentVaue = currentVaue;
		this.acquiredDate = acquiredDate;
	}

	public String getCountry() 
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	public String getDenomination() 
	{
		return denomination;
	}

	public void setDenomination(String denomination) 
	{
		this.denomination = denomination;
	}

	public int getMintingyear() 
	{
		return mintingyear;
	}

	public void setMintingyear(int mintingyear) 
	{
		this.mintingyear = mintingyear;
	}

	public int getCurrentVaue() 
	{
		return currentVaue;
	}

	public void setCurrentVaue(int currentVaue) 
	{
		this.currentVaue = currentVaue;
	}

	public int getAcquiredDate() 
	{
		return acquiredDate;
	}

	public void setAcquiredDate(int acquiredDate) 
	{
		this.acquiredDate = acquiredDate;
	}

	public void addCoins()
	{
		System.out.println("Enter the coin details......");	
		System.out.println("Enter the country  : ");
		country=sc.next();
		System.out.println("Enter the denomination  : ");
		denomination=sc.next();
		System.out.println("Enter the year of minting  : ");
		mintingyear=sc.nextInt();
		System.out.println("Enter the current value  : ");
		currentVaue=sc.nextInt();
		System.out.println("Enter the Acquired date  : ");
		acquiredDate=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Coin details are.........");
		System.out.println("Country         :"+country);
		System.out.println("Denomination    :"+denomination);
		System.out.println("Minting Year    :"+mintingyear);
		System.out.println("Current Value   :"+currentVaue);
		System.out.println("Acquired Date   :"+acquiredDate);
		System.out.println("------------------------------------\n");
	}	

}
