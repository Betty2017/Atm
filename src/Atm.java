import java.util.ArrayList;
import java.util.Scanner;

public class Atm {
	Scanner sc = new Scanner(System.in);
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	Account a = new Account();
	Account b = new Account();
	Account c = new Account();
	
	public void store(){
		a.setAccountNumber(123456);
		a.setUserName("Betty");
		a.setBalance(1000000);
		a.setPin(1234);
		accounts.add(a);
		
		b.setAccountNumber(654321);
		b.setUserName("Bini");
		b.setBalance(2000000);
		b.setPin(4321);
		accounts.add(b);
		
		c.setAccountNumber(765466);
		c.setUserName("yohana");
		c.setBalance(7000000);
		c.setPin(5768);
		accounts.add(c);
			
	}
	
	public void prompt(){
		
	System.out.println("Enter Account Number");
	long accNumber = sc.nextLong();

	while (accNumber != a.getAccountNumber() && accNumber != b.getAccountNumber() && accNumber != c.getAccountNumber())
		
	{
		System.out.println("try another accout Number.Y/N");
		accNumber = sc.nextLong(); 
		
	}
	
	int pin = checkacount(accNumber);
	
	System.out.println("Enter Your PIN");
	int pinNumber = sc.nextInt();
	boolean result = checkPin(pinNumber,pin);
	if (result==true)
	{
		System.out.print("========================\n"
				 +"ATM Menu: \n \n"
				 + "1. Check Account Balance \n"
				 + "2. Withdraw Money \n"
				 + "3. Deposit Money \n"
				 + "4. Exit \n"
				 + "========================\n");
		int option= sc.nextInt();
		if (accNumber == a.getAccountNumber())
		{
				switch(option){  
			    case 1: System.out.println("Your accout balance is " + a.getBalance());
			    break;  
			    case 2:System.out.println("Your accout balance is " + a.getBalance());
			    	System.out.println("Enter withdraw amount");
						double witAmount = sc.nextDouble();
						double withdrawBalance;
						withdrawBalance = a.getBalance() - witAmount;
				    	System.out.println("Your Current Account balance is "+ withdrawBalance);
				    	break;  
			    case 3: System.out.println("Your accout balance is " + a.getBalance());
			    	System.out.println("Enter deposit amount");
						double depAmount = sc.nextDouble();
						double depositBalance;
						depositBalance = a.getBalance() + depAmount ;
				    	System.out.println("Your Current  Account balance is "+ depositBalance);
						break;  
			    case 4: System.out.println("\nThank you for banking with us!\n");break; 
			    default:System.out.println("Not valid entry");  
			    }  
			
		}
		else if (accNumber == b.getAccountNumber())
		{
			    switch(option){  
			    case 1: System.out.println("Your accout balance is " + b.getBalance());break;  
			    case 2:System.out.println("Your accout balance is " + b.getBalance());
			    	System.out.println("Enter withdraw amount");
						double witAmount = sc.nextDouble();
						double withdrawBalance;
						withdrawBalance = b.getBalance() - witAmount;
				    	System.out.println("Your Account balance is "+ withdrawBalance);
				    	break;  
			    case 3:System.out.println("Your accout balance is " + b.getBalance()); 
			    	System.out.println("Enter deposit amount");
						double depAmount = sc.nextDouble();
						double depositBalance;
						depositBalance = b.getBalance() + depAmount ;
				    	System.out.println("Your Account balance is "+ depositBalance);
						break; 
			    case 4: System.out.println("\nThank you for banking with us!\n");break; 
			    default:System.out.println("Not valid entry");  
			    }  
			
		}

		else 
		{
			    switch(option){  
			    case 1: System.out.println("Your accout balance is " + c.getBalance());break;  
			    case 2:System.out.println("Your accout balance is " + c.getBalance());
			    		System.out.println("Enter withdraw amount");
						double witAmount = sc.nextDouble();
						double withdrawBalance;
						withdrawBalance = c.getBalance() - witAmount;
				    	System.out.println("Your Account balance is "+ withdrawBalance);
				    	break;  
			    case 3: System.out.println("Your accout balance is " + c.getBalance());
			    		System.out.println("Enter deposit amount");
						double depAmount = sc.nextDouble();
						double depositBalance;
						depositBalance = c.getBalance() + depAmount ;
				    	System.out.println("Your Account balance is "+ depositBalance);
						break; 
			    case 4: System.out.println("\nThank you for banking with us!\n");break; 
			    default:System.out.println("Not valid entry");  
			    } 
		}
		 
	}
	else 
		
	System.out.println("Maximum attempt reached. \n Your Account is blcoked ");
	
	
	}
	
	
	public boolean checkPin(int thePinNumber, int pin){
		
		if (thePinNumber==pin)
			return true;
		else
		{
			int i=0;
			while(i<2){
				if (thePinNumber==pin)
					return true;	
				else{
					System.out.println("try again");
					 thePinNumber = sc.nextInt();
				}
				i++;
			}
		}
		return false;
	}
	public int checkacount(long theAccountNumer){
		if (theAccountNumer == a.getAccountNumber())
			return a.getPin();
		else if (theAccountNumer == b.getAccountNumber())
			return b.getPin();
		else 
			return c.getPin();
	}
	
	}
