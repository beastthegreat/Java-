import java.util.Scanner;

public abstract class account {
	
	 int accNo;
	 String name;
	 float balance;
	 String transactions = "";
	 
	 static int accNumber = 10000;
	 Scanner sc=new Scanner(System.in);
	 
	 public void addAccount()
	 {
		 accNumber++;
		 this.accNo = accNumber;
		 System.out.print("Please enter your full name: ");
		 String name = sc.nextLine();
		 this.name = name;
		 System.out.println("Please enter account opening amount: ");
		 float balance = sc.nextFloat();
		 this.balance = balance;
	 }
	 
	 public void displayAccount() {
		 System.out.println("-------------------------------------------");
		 System.out.println("The account details are:");
		 if (this instanceof savingsAccount) {
			 System.out.println("Account type: Savings Account");
		 }
		 else if (this instanceof currentAccount) {
			 System.out.println("Account type: Current Account");
		 }
		 else if (this instanceof salaryAccount) {
			 System.out.println("Account type: Salary Account");
		 }
		 System.out.println("Account Number: "+this.accNo);
		 System.out.println("Name: "+this.name);
		 System.out.println("Account balance: "+this.balance);
		 System.out.println("-------------------------------------------");
	 }
	 
	 public void checkBalance() {
		 System.out.println("-------------------------------------------");
		 System.out.println("The account details are:");
		 	if (this instanceof savingsAccount) {
			 	System.out.println("Account type: Savings Account");
		 	}
		 	else if (this instanceof currentAccount) {
			 	System.out.println("Account type: Current Account");
		 	}
		 	else if (this instanceof salaryAccount) {
			 	System.out.println("Account type: Salary Account");
		 	}
		 	System.out.println("The account balance is: "+ this.balance);
	 	System.out.println("-------------------------------------------");
	 }
	 
	 public void deposit(int amt) {
		 this.balance += amt;
		 System.out.println("-------------------------------------------");
		 System.out.println("The account details are:");
		 	if (this instanceof savingsAccount) {
			 	System.out.println("Account type: Savings Account");
		 	}
		 	else if (this instanceof currentAccount) {
			 	System.out.println("Account type: Current Account");
		 	}
		 	else if (this instanceof salaryAccount) {
			 	System.out.println("Account type: Salary Account");
		 	}
		 this.transactions += "\nAmount "+amt+" deposited ==> Account balance is "+this.balance;
		 System.out.println("The amount "+amt+" is deposited successfully, Account balance is "+this.balance);
		 System.out.println("-------------------------------------------");
	 }
	 
	 public void withdraw(float amt) {
		 if(amt > this.balance) {
			 System.out.println("Insufficient balance!!");
		 }
		 else if(amt < 1) {
			 System.out.println("Please enter valid amount to withdraw!!");
		 }
		 else {
			 this.balance -= amt;
			 System.out.println("-------------------------------------------");
			 System.out.println("The account details are:");
			 	if (this instanceof savingsAccount) {
				 	System.out.println("Account type: Savings Account");
			 	}
			 	else if (this instanceof currentAccount) {
				 	System.out.println("Account type: Current Account");
			 	}
			 	else if (this instanceof salaryAccount) {
				 	System.out.println("Account type: Salary Account");
			 	}
			 this.transactions += "\nAmount "+amt+" withdrawn ==> Account balance is "+this.balance;
			 System.out.println("Transaction successfully, Account balance is "+this.balance);
			 System.out.println("-------------------------------------------");
		 }
	 }
	 
}
	