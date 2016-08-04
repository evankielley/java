import java.util.Scanner;

public class ShippingBoxes
{
	static Scanner userInput = new Scanner(System.in);
	private static int initBox;
	private static int extraBox;
	private static double discount;
	private static int sum = 0;
	
	public static void main(String args[])
	{
		{
			for (int i = 0; i < 4; i++)
			{
				System.out.println("Enter Customer ID: ");
				int id = userInput.nextInt();

				System.out.println("How many boxes are to be shipped?");
				initBox = userInput.nextInt();
								
				System.out.println();
						
				if (initBox >= 0 && initBox < 10)
				{
					extraBox = 0;
					discount = 0.0;
				}
				else if (10 <= initBox && initBox < 25)
				{
					extraBox = 1;
					discount = 0.0;
				}
				else if (25 <= initBox && initBox <= 50)
				{
					extraBox = 2;
					discount = 0.10;
				}

				else if (initBox > 50)
				{
					int bob = initBox / 50;
					bob = bob * 2;
					extraBox = bob;
					discount = 0.15;
				}
				
				System.out.println("Customer ID: " + id);
		
				int totalBox = initBox + extraBox;
				System.out.println("Number of boxes shipped: " + totalBox);
		
				double cost = initBox * 6;
				System.out.println("Cost of boxes ordered: " + cost);
		
				double discountAmount = discount * cost;
				System.out.println("Discount: " + discountAmount);
		
				double taxes = (cost - discountAmount) * 0.15;
				System.out.println("Taxes:" + taxes);
				
				double totalCost = cost - discountAmount + taxes;
				System.out.println("Total: " + totalCost);
				
				System.out.println();
		
				sum += totalBox;
		
			}
			
			System.out.println("The total number of boxes shipped is: " + sum);
			
		}
	}
}