import java.util.Scanner;

public class mainApplication {

	account [] multipleAccount = new account[] { new savingsAccount(), new salaryAccount(), new currentAccount()};
	
	public static void main(String[] args) {
		System.out.println("=====================================");
		System.out.println("Welcome to IACSD Bank");
		System.out.println("=====================================");
		
		mainApplication m = new mainApplication();
		
		m.start();
		
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);	
		int choice;
	do {
		System.out.println("Do you have account associated with us?");
		System.out.println("1: Yes\n2: No\n3: Exit");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			menu();
			break;
		case 2:
			Account();
			break;
		case 3:
			System.out.println("Thankyou!!");
			System.exit(1);
		default:
			System.out.println("Please select correct option");
		}
	}while(choice != 5);
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);	
			int choice;
		do {
			System.out.println("Please select options");
			System.out.println("1: Counter\n2: Interest Calculation\n3: Daily transaction report\n4: Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				Counter();
				break;
			case 2:
				System.out.println("Interest Calculation");
				break;
			case 3:
				System.out.println("Please enter account no to check balance:");
				int taccno = sc.nextInt();
				for(int j = 0 ; j < multipleAccount.length ; j++) {
					if (multipleAccount[j] == null) {
						System.out.println("Account does not exist!!");
						break;
					}
					else if(multipleAccount[j].accNo == taccno) {
						System.out.println(multipleAccount[j].transactions);
						break;
					}
					else if(j == multipleAccount.length-1){
						System.out.println("Account not found");
					}
				}
				break;
			case 4:
				System.out.println("Thankyou!!");
				break;
			default:
				System.out.println("Please select correct option");
				break;
			}
		}while(choice != 4);
	}
	
	public void Account() {
		Scanner sc = new Scanner(System.in);	
		int choice;
		do {
			System.out.println("Please select options");
			System.out.println("1: Open Account\n2: Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				openAccount();
				break;
			case 2:
				System.out.println("Thankyou!!");
				break;
			default:
				System.out.println("Please select correct option");
				break;
			}
		}while(choice != 2);
	}
	
	public void Counter() {
		Scanner sc = new Scanner(System.in);	
		int choice;
		int taccno;
		do {
			System.out.println("Please select options");
			System.out.println("1: Check Balance\n2: Withdraw \n3: Deposit\n4: Close Account\n5: Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Please enter account no to check balance:");
				taccno = sc.nextInt();
				for(int j = 0 ; j < multipleAccount.length ; j++) {
					if (multipleAccount[j] == null) {
						System.out.println("Account does not exist!!");
						break;
					}
					else if(multipleAccount[j].accNo == taccno) {
						multipleAccount[j].checkBalance();
						break;
					}
					else if(j == multipleAccount.length-1){
						System.out.println("Account not found");
					}
				}
				break;
			case 2:
				System.out.println("Please enter account no:");
				taccno = sc.nextInt();
				System.out.println("Please enter amount to withdraw");
				int wamt = sc.nextInt();
				for(int j = 0 ; j < multipleAccount.length ; j++) {
					if(multipleAccount[j].accNo == taccno) {
						multipleAccount[j].withdraw(wamt);
						break;
					}
					else if(j == multipleAccount.length-1){
						System.out.println("Account not found");
					}
				}
				break;
			case 3:
				System.out.println("Please enter account no:");
				taccno = sc.nextInt();
				System.out.println("Please enter amount to deposit");
				int damt = sc.nextInt();
				for(int j = 0 ; j < multipleAccount.length ; j++) {
					if(multipleAccount[j].accNo == taccno) {
						multipleAccount[j].deposit(damt);
						break;
					}
					else if(j == multipleAccount.length-1){
						System.out.println("Account not found");
					}
				}
				break;
			case 4:
				closeAccount();
				break;
			case 5:
				start();
				break;
			default:
				System.out.println("Please select correct option");
				break;
			}
		}while(choice != 5);
		
	}
	
	public void openAccount() {
		Scanner sc = new Scanner(System.in);	
		int choice;
		do {
			System.out.println("Select Account to Open");
			System.out.println("1: Saving Account\n2: Salary Account\n3: Current Account \n4: Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				openSavingaccount();
				start();
				break;
			case 2:
				openSalaryaccount();
				start();
				break;
			case 3:
				openCurrentaccount();
				start();
				break;
			case 4:
				start();
				break;
			default:
				System.out.println("Please select correct option");
				break;
			}
		}while(choice != 4);
	}
	
	public void closeAccount() {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Please enter account number to close account:");
	int tempAccno = sc.nextInt();
	for(int j = 0 ; j < multipleAccount.length ; j++) {
			if(multipleAccount[j].accNo == tempAccno) {
				multipleAccount[j]= null;
				System.out.println("Account closed");
				break;
			}
			else if(j == multipleAccount.length-1){
				System.out.println("Account not found");
			}
		}
	}
	
 	public void openSavingaccount() {
 		
 		multipleAccount[0].addAccount();
		multipleAccount[0].displayAccount();
		
	}
	
	public void openSalaryaccount() {
	
		multipleAccount[1].addAccount();
		multipleAccount[1].displayAccount();
		
	}
	
	public void openCurrentaccount() {
		
		multipleAccount[2].addAccount();
		multipleAccount[2].displayAccount();
		
	}

}
