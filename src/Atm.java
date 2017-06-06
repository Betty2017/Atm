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
	int count =1;
	
	if(accNumber==a.getAccountNumber()||accNumber==b.getAccountNumber()||accNumber==c.getAccountNumber())
	{
	System.out.println("Enter Your PIN");
	int pinNumber = sc.nextInt();
	int pinStored=0;
	if(accNumber==123456)
	{ pinStored=a.getPin();
	 	while(pinNumber == pinStored && count> 3)
	 	{
	 		System.out.println("Enter another PIN");
	 		pinNumber = sc.nextInt();
	 		count ++;
	 	}
	 	System.out.println("Sorry Account Blocked");
	 	
	}
	else if (accNumber==654321)
		 pinStored=b.getPin();
	else
		pinStored=c.getPin();
	}
	System.out.println("1: Check Balance");
	int check= sc.nextInt();
	System.out.println("2: Withdraw");
	int withdeaw= sc.nextInt();
	System.out.println("3: Deposit");
	int deposit= sc.nextInt();
	}
	
	
	
	}
