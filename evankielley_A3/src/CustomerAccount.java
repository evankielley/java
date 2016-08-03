import java.util.Scanner;
public class CustomerAccount
{
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		boolean flag = true;
		
	    System.out.println("Please enter the account number:");
	    String accountNumber = in.nextLine();
	    System.out.println("Please enter the initial balance: ");
	    double balance = in.nextDouble();
	    char transactionType = 'D';
	   	    
		while(flag)
		{
		    System.out.println("Please enter the transaction type (D to deposit, W to withdraw, Q to quit): ");
		    transactionType = in.next().charAt(0);
		    if (transactionType == 'D' || transactionType == 'W')
		    {
		    	balance = updateBalance(balance, transactionType);
		    	System.out.print("Account Number: " + accountNumber + "  ");
		    	System.out.println("Updated Balance: " + balance + "\n");
		    }
		    else
		    {
		    	flag = false;
		    }
		}
		
	    System.out.println("Monthly Interest is: ");

	}
	static double updateBalance(double balance, char transactionType)
	{

		System.out.println("Please enter the amount to be deposited or withdrawn: ");
		double transactionAmount = in.nextDouble();
		
		if(transactionType == 'D' || transactionType == 'D')
		{
			balance += transactionAmount;
		}
		else if(transactionType == 'W' || transactionType == 'W')
		{
			balance -= transactionAmount;
		}

		return balance;
	}
	static double computeMonthlyInterest(double balance)
	{
		return 0.0;
	}
}