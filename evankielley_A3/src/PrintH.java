import java.util.Scanner;

public class PrintH
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the height of H: ");
		int fourOrMore = in.nextInt();
		int findThird = findThird(fourOrMore);
		
		System.out.println();
				
		for(int i = 0; i < findThird; i++)
		{
		printTopAndBottom(findThird);
		}
		for(int j = 0; j < findThird; j++)
		{
			printMidH(findThird);
		}
		for(int i = 0; i < findThird; i++)
		{
		printTopAndBottom(findThird);
		}
	}
	public static int findThird(int fourOrMore)
	{
		int remainder = fourOrMore % 3;
		int findThird = 0;
		switch(remainder)
		{
		case 0:
			findThird = fourOrMore / 3;
			break;
		case 1:
			fourOrMore += 2;
			findThird = fourOrMore / 3;
			break;
		case 2: 
			fourOrMore++;
			findThird = fourOrMore / 3;
			break;
		}
		return findThird;
	}
	public static void printTopAndBottom(int findThird)
	{
		for(int i = 0; i < findThird; i++)
		{
			System.out.print("h");
		}
		for(int j = 0; j < findThird; j++)
		{
			System.out.print(" ");
		}
		for(int k = 0; k < findThird; k++)
		{
			System.out.print("h");
		}
		System.out.println();
	}
	public static void printMidH(int findThird)
	{
		for(int i = 0; i < (findThird * 3); i++)
		{
			System.out.print("h");
		}
		System.out.println();
	}
}