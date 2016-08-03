// I could have easily used nested loops but this is more efficient.

public class PrintPattern
{
	public static void main(String args[])
	{

		     for (int i = 2; i < 8; i++) 
		           System.out.println("@@@@@@@@@@@@@".substring(i, (2 * i) -1  ));

		     for (int i = 5; i > 0; i--)
		         System.out.println("@@@@@@@@@@@".substring(i - 1,(2 * i) - 1));

	}
}