import java.util.ArrayList;
import java.util.Scanner;

public class Atm {
	Scanner sc = new Scanner(System.in);
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	Account a = new Account();
	Account b = new Account();
	Account c = new Account();
	public void store()
	{
		a.setAccountNumber(123456);
		a.setUserName("Betty");
		a.setBalance(100000);
		a.setPin(1234);
		accounts.add(a);
		
		
		b.setAccountNumber(654321);
		b.setUserName("Bini");
		b.setBalance(200000);
		b.setPin(4321);
		accounts.add(b);
		
		
		c.setAccountNumber(765466);
		c.setUserName("yohana");
		c.setBalance(700000);
		c.setPin(5768);
		accounts.add(c);
		
			
	}
	
	public void prompt()
	{
		
		String choice ="y";
		int count =1;
		System.out.println("Enter Account Number");
		long accNumber = sc.nextLong();
		
		while (accNumber != a.getAccountNumber() && accNumber != b.getAccountNumber() && accNumber != c.getAccountNumber())
			
		{
			System.out.println("try another accout Number.Y/N");
			accNumber = sc.nextLong(); 
			
		}	
		System.out.println("Enter Your PIN");
		int pinNumber = sc.nextInt();
		
while (pinNumber != a.getPin() && pinNumber != b.getPin() && pinNumber != c.getPin() && count < 2)	






{
	
	if (pinNumber== a.getPin())
	{
		System.out.println("\n  Press 1 to Check Balance \n  Press 2 to Withdraw \n  Press 3 to Deposit");
		int option= sc.nextInt();
		  
		    switch(option){  
		    case 1: System.out.println("Your accout balance is " + a.getBalance());break;  
		    case 2:System.out.println("Enter withdraw amount");
					double witAmount = sc.nextDouble();
					double withdrawBalance;
					withdrawBalance = a.getBalance() - witAmount;
			    	System.out.println("Your Account balance is "+ withdrawBalance);
			    	break;  
		    case 3: System.out.println("Enter deposit amount");
					double depAmount = sc.nextDouble();
					double depositBalance;
					depositBalance = a.getBalance() + depAmount ;
			    	System.out.println("Your Account balance is "+ depositBalance);
					break;  
		    default:System.out.println("Not valid entry");  
		    }  
		
	}

	else if (pinNumber== b.getPin())
	{
		System.out.println("\n  Press 1 to Check Balance \n  Press 2 to Withdraw \n  Press 3 to Deposit");
		int option= sc.nextInt();
		  
		    switch(option){  
		    case 1: System.out.println("Your accout balance is " + b.getBalance());break;  
		    case 2:System.out.println("Enter withdraw amount");
					double witAmount = sc.nextDouble();
					double withdrawBalance;
					withdrawBalance = b.getBalance() - witAmount;
			    	System.out.println("Your Account balance is "+ withdrawBalance);
			    	break;  
		    case 3: System.out.println("Enter deposit amount");
					double depAmount = sc.nextDouble();
					double depositBalance;
					depositBalance = b.getBalance() + depAmount ;
			    	System.out.println("Your Account balance is "+ depositBalance);
					break;  
		    default:System.out.println("Not valid entry");  
		    }  
		
	}

	else if (pinNumber== c.getPin())
	{
		System.out.println("\n  Press 1 to Check Balance \n  Press 2 to Withdraw \n  Press 3 to Deposit");
		int option= sc.nextInt();
		  
		    switch(option){  
		    case 1: System.out.println("Your accout balance is " + c.getBalance());break;  
		    case 2:System.out.println("Enter withdraw amount");
					double witAmount = sc.nextDouble();
					double withdrawBalance;
					withdrawBalance = c.getBalance() - witAmount;
			    	System.out.println("Your Account balance is "+ withdrawBalance);
			    	break;  
		    case 3: System.out.println("Enter deposit amount");
					double depAmount = sc.nextDouble();
					double depositBalance;
					depositBalance = c.getBalance() + depAmount ;
			    	System.out.println("Your Account balance is "+ depositBalance);
					break;  
		    default:System.out.println("Not valid entry");  
		    } 
	}
	else  
		 	System.out.println("Enter another PIN");
			pinNumber = sc.nextInt();
			count ++;
			
			}
System.out.println("Sorry Account Blocked"); 
	}	
	
		
	}



