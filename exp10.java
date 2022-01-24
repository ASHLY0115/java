//mini-application for a banking system in Java. In this program, we will add some basic functionalities of a bank account like a deposit of amount, withdrawal of amount, etc.Initially, the program accepts the number of customers (Array of Objects)we need to add and adds the customer and account details accordingly. Further, it displays the series of menus to operate over the accounts.

//1.Display all account details

//2.Search by account number

//3.Deposit the amount

//4.Withdraw the amount

//5.Exit 

//Create Custom Exception and perform the following action:

//Customers are not allowed to deposit amount <= 0 ( In this case throw InvalidAmountException).

//Customers are not allowed to withdraw amount <= 0 (throw InvalidAmountException).

//Customers are also not allowed to withdraw an amount greater than (>) the available amount (throw InsufficientFundsException)

import java.util.*;
import java.util.Arrays;
	 class DepositException extends Exception {
		String message;
		public DepositException(String msg)
		{
			message=msg;
		}
		public String getMessage()
		{
			return message;
		}
	}
	class WithdrawException extends Exception{
			String message;
			public WithdrawException(String msg)
			{
				message=msg;
			}
			public String getMessage()
			{
				return message;
			}
		}
		
	// WithdrawException and DepositException are defined as its own file(class) in the same package
	class Bank{
		private String acc_holder,acc_number,acc_type;
		private long acc_balance;
		Scanner sc=new Scanner(System.in);
		//To Open Account
		void OpenAccount()
		{
			System.out.println("Name of Account holder:  ");
			acc_holder=sc.next();
			System.out.println("Type of account       :  ");
			acc_type=sc.next();
			System.out.println("Account Number        :  ");
			acc_number=sc.next();
			System.out.println("Account Balance       :  ");
			acc_balance=sc.nextLong();
		}
		//Show Account
		void ShowAccount()
		{
			System.out.println("Name of Account holder:  "+acc_holder);
			System.out.println("Type of account       :  "+acc_type);
			System.out.println("Account Number        :  "+acc_number);
			System.out.println("Account Balance       :  "+acc_balance);
		}
		//Search Account 
		public boolean SearchAcc(String acc_no)
		{
			if(acc_number.equals(acc_no))
			{
				return (true);
			}
			else
				return (false);
			
		}
		
		//To Deposit Funds
		void Deposit()
		{
			long a_deposit;
			System.out.println("Enter the amount to be deposited :");
			a_deposit=sc.nextLong();
			
			try {
			if(a_deposit<=0)
			{
				throw new DepositException("Enter valid amount");
			}
			}
			catch(DepositException e)
			{
				System.out.println(e.getMessage());
			}
			
			acc_balance+=a_deposit;
			System.out.println("Current balance: "+acc_balance);
		}
		
		//To Withdraw Funds
		void Withdraw()
		{
			long a_withdraw;
			System.out.println("Enter the amount to be withdrawn :");
			a_withdraw=sc.nextLong();
				try {
					if(a_withdraw<=0)
					{
						throw new WithdrawException("Enter valid amount");
					}
				}
					catch(WithdrawException e)
					{
					System.out.println(e.getMessage());
					}
				
			if(a_withdraw>acc_balance)
			{
				System.out.println("Insufficient funds!!");
			}
			else
			{
			acc_balance-=a_withdraw;
				System.out.println("Current balnce: "+acc_balance);
			}
		}
		
	}



	//MAIN METHOD
	public class exp10 {
		public static void main(String[] args) {
			Bank B=new Bank();
			Scanner sc=new Scanner(System.in);
			int choice;
			boolean customer=false;
			B.OpenAccount();
		
			System.out.println("1.Display all account details");
			System.out.println("2.Search by account ");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
			do
			{
				System.out.println("Please enter your choice: ");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
				{
					B.ShowAccount();
					break;
				}
				case 2:
				{
					{
					System.out.println("Enter Account Number: ");
					String acc_no=sc.next();
					if(B.SearchAcc(acc_no))
					{
						B.ShowAccount();
					}
					else
					{
						System.out.println("ACCOUNT NOT FOUND!!");
					}
					}
					break;
				}
				case 3:
				{
					{
					System.out.println("Enter Account Number to deposit funds: ");
					String acc_no=sc.next();
					if(B.SearchAcc(acc_no))
					{
						B.Deposit();
					}
					else
					{
						System.out.println("ACCOUNT NOT FOUND!!");
					}
					}
					break;
				}
				case 4:
				{
					{
						System.out.println("Enter Account Number to withdraw funds: ");
						String acc_no=sc.next();
						if(B.SearchAcc(acc_no))
						{
							B.Withdraw();
						}
					}
					break;
				}
				case 5:
				{
					System.out.println("--THANK YOU--");
					break;
				}
				default :
					System.out.println("Couldnt find entered choice");
				}
				
			}while(choice!=5);
		}

	}
