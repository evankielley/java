import java.util.Scanner;

public class DecodePhone
{
	
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Type in some letters to obtain your magic number.");
		String str = userInput.nextLine();
		str = str.toUpperCase();
		int length = str.length();
		char[] charArray = str.toCharArray();
		char[] bobArray = decodePhone(charArray, length);
		
		for (int i = 0; i < 3; i++)
		{
		System.out.print(bobArray[i]);
		}
		System.out.print("-");
		
		for (int i = 3; i < 6; i++)
		{
		System.out.print(bobArray[i]);
		}
		System.out.print("-");
		
		for (int i = 6; i < bobArray.length; i++)
		{
		System.out.print(bobArray[i]);
		}
					
	}
	
	public static char[] decodePhone(char[] charArray, int length)
	{
		for(int i = 0; i < length; i++)
		{
			switch (charArray[i]) {
			
			case 'Q':  
				charArray[i] = '1';
				break;
				
			case 'Z':
				charArray[i] = '0';
				break;
			
			case 'A':
			case 'B':
			case 'C':
				charArray[i] = '2';
				break;
			
			case 'D':
			case 'E':
			case 'F':
				charArray[i] = '3';
				break;
			
			case 'G':
			case 'H':
			case 'I':
				charArray[i] = '4';
				break;
			
			case 'J':
			case 'K':
			case 'L':
				charArray[i] = '5';
				break;
			case 'M':
			case 'N':
			case 'O':
				charArray[i] = '6';
				break;
			
			case 'P':
			case 'R':
			case 'S':
				charArray[i] = '7';
				break;
				
			case 'T':
			case 'U':
			case 'V':
				charArray[i] = '8';
				break;
			
			case 'W':
			case 'X':
			case 'Y':
				charArray[i] = '9';
				break;
				
			}
			
		}
		
		return charArray;
	}
	
}