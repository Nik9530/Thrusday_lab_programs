// java program to build a ATM


package july_28_2022;

	// importing package
import java.util.*;

	// class declaration 
public class atm 

{	//initialing default current balance 
	static int balance=500;
	static String name;
	
	// main method
	public static void main(String[] args) 
	{
		System.out.println("***********WELCOME***********");
		System.out.println();
		accept();
		choose();	}
	
	// a function to accept values from user
	static void accept()
	{
		// assigning variables
		
		
		long account_no,mobile_no;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter your mobile no.");
		mobile_no=sc.nextLong();
		System.out.println("Enter your account no.");
		account_no=sc.nextLong();
	}
	
	// a function to perfome choice
	static void choose()
	{	 
		// appling while loop for choice
		while (true)
		{
			Scanner sc=new Scanner (System.in);
			System.out.println();
			System.out.println("Hello "+name);
			System.out.println();
			System.out.println("Choose what do you want");
			System.out.println();
	        System.err.println("Choose 1 for Withdraw");  
	        System.err.println("Choose 2 for Deposit");  
	        System.err.println("Choose 3 for Check Balance");  
	        System.err.println("Choose 4 for EXIT");
	        System.out.println();
	        System.out.print("plz write your choice ");
	        
	        // a variable for store choice
	        int choice=sc.nextInt();
	        
	        switch(choice)
	        {
	        // to withdrawal
	        case 1:
	        	
	        {
	        	System.out.println("you want to withdraw");
	        	System.out.println("Enter the amount that you want to withdraw ");
	        	int withdraw=sc.nextInt();
	        	
	        	//condition for current balance 
	        	if(withdraw<balance)
	        	{
	        		int current_bal=balance-withdraw;
	        		System.out.println("your current balance is "+current_bal);
	        		System.out.println("thank you for using our ATM");
	        	}
	        	else
	        	{
	        		System.out.println("you don`t have enough amount for withdrawal");
	        	}
	        	
	        System.out.println("");
	        break;
	        	
	        }
	        
	        // to Deposite
	        case 2:
	        	
	        {
	        	System.out.println("you want to Deposite");
	        	System.out.println("Enter the amount that you want to Deposite ");
	        	
	        	//condition for current balance 
	        	int deposite=sc.nextInt();
	        	int current_balance=deposite+balance;
	        	System.out.println("your current balance is "+current_balance);
	        	
	        System.out.println("");
	        break;
	        }
	        
	        // to check balance 
	        case 3:
	        {
	        	System.out.println("your current balance is "+balance);
	        	break;
	        }
	        
	       //to exit
	        case 4:
	        {
	        	System.out.println("Thanks for using our service 😊");
	        	break;
	        }
	        
	        // default
	        default:
	        {
	        	System.exit(0);
	        }
	        }
	              
			
		
		}
	}
	


}
