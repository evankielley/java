import java.util.Scanner;

public class ProcessNumbers
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number that is between 6 and 12, inclusive: ");
		int num = in.nextInt();
		System.out.println();
		processInput(shouldProcess(num), num);
		in.close();
	}
	static boolean shouldProcess(int num)
	{
		if(6 <= num && num <= 12)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	static void processInput(boolean shouldProcess, int num)
	{
		if(shouldProcess == true)
		{
			String sum = Integer.toString(findSum(num));
			System.out.print("The sum from 1 to " + num + " is: " + sum + "\n");
			String prod = Integer.toString(findProduct(num));
			System.out.print("The product from 1 to " + num + " is: " + prod + "\n");
			System.out.print("The divisors of ");
			System.out.print(" are: ");
			findDivisors(num);
		}
		else
		{
			System.out.println("Number is outside of acceptable range.");
		}
	}
	static int findSum(int num)
	{
		int sum = 0;
		for(int i = 0; i <= num; i++)
		{
			sum += i;
		}
        return sum;
	}
	static int findProduct(int num)
	{
		int prod = 1;
		for(int i = 1; i <= num; i++)
		{
			prod *= i;
		}
		return prod;
		}
	static void findDivisors(int num)
	{
		int sum = findSum(num);
		for(int i = 2; i <= (sum / 2); i++)
		{
			if((sum % i) == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}