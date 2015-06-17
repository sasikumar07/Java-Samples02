import java.io.*;
import java.util.Scanner;
import java.util.*;
class Bank
{

static float amount=10340,bal,with,dep;

	static void Withdraw()
	{
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("\n your Account already have :\t\t\tRs."+amount);
		
		System.out.println("\t\t\t **** CASH WITHDRAW *****");
		System.out.println("\nEnter the withdraw amount :\t\tRs.");
		Scanner in=new Scanner(System.in);
		with=in.nextFloat();	
		bal=amount-with;
		
		System.out.println("Withdraw amount is :\t\t\t\t Rs."+with);
		System.out.println("\n\nCurrent Your Account Balance :\t\t\tRs."+bal);
		amount=bal;
	}

	static void Deposit()
	{
		
		System.out.println("\n your Account already have :\t\t\tRs."+amount);
		
		System.out.println("\t\t\t **** CASH DEPOSIT *****");
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter the Deposit amount :\t\tRs.");
		dep=in.nextFloat();	
			amount=amount+dep;
		
		System.out.println("Deposit amount is :\t\t\t\t Rs."+dep);
		amount=dep;
		System.out.println("\n\nCurrent Your Account Balance :\t\t\tRs."+amount);
		
	
	}

	static void Balance()
	{
				System.out.println("\t\t\t **** BANK BALANCE *****");
		System.out.println("\n\nCurrent Your Account Balance :\t\t\tRs."+amount);
		System.out.println("---------------------------------------------------------------------------------------------");
	}


 
	public static void main(String args[])
	{

	int select;
        do
		{		
		System.out.println("------------------Enter the banking type please put given number display on screen-------------- ");
		System.out.println("\n1.Withdraw \n 2.Deposit \n 3.Balance enquiry \n -------- Exit from the program press 0 ---------   ");
		
		
		// using this program in (goto) statement
		

		Scanner in=new Scanner(System.in);
			select= in.nextInt();
	
      switch(select)
      {
		  case 0:System.out.println("\n\n\n\n\t\tThank You ");
		  break;
         case 1 :Bank obj=new Bank();
            obj.Withdraw();
		
		break;
         case 2 :
		   Bank obj1= new Bank();
		 obj1.Deposit();	
            break;
         case 3 :
            Bank obj2= new Bank();
			obj2.Balance();
		
            break;
        default :
            System.out.println("Invalid Option");
		}
		
		}while(select!=0);
	}
}

