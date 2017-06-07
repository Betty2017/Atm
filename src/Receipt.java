import java.util.Scanner;

public class Receipt {
<<<<<<< HEAD
	Scanner sc = new Scanner(System.in);
	
	Receipt(){
		System.out.println("Print Receipt Y/N");
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("y"))
		{
=======

	Receipt(){
>>>>>>> d2151392833484ec57cd5891158448c14f54768a
		System.out.println("-------------------------------------------");
		System.out.println("|         Java Bank ATM Receipt           |");
		System.out.println("|         Wednesday, December 2, 2015     |");
		System.out.println("|                                         |");
		System.out.println("|                                         |");
		System.out.println("|         Account Number:      1234567    |");
		System.out.println("|         Customer:     John Q. Public    |");
		System.out.println("|         Transaction Type:    Deposit    |");
		System.out.println("|         Transaction Amount:  $500.00    |");
		System.out.println("|         Account Balance:   $1,500.00    |");
		System.out.println("|                                         |");
		System.out.println("|                                         |");
		System.out.println("|         Thank you for banking with us   |");
		System.out.println("|              Have a coffee day          |");
		System.out.println("|                                         |");
		System.out.println("------------------------------------------");
<<<<<<< HEAD
		}
		else System.out.println("\nThank you for banking with us!\n");
}}
=======
	
		Account today = new Account();
		//today.setDate(0); 
		

	
		
	}
	
	
}
>>>>>>> d2151392833484ec57cd5891158448c14f54768a
