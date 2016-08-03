import java.util.ArrayList;
import java.util.Scanner;

public class StrictDescending
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter a list of three digit numbers. ");


        int check=0;
        while(true)
        {
            check = userInput.nextInt();
            if(check < 100 || 999 < check) break;
            al.add(check);
        }
        System.out.println(isSorted(al));
	}
	
    public static String isSorted(ArrayList<Integer> al)
    {
   	      for (int i = 1; i < al.size(); i++) 
   	      {
   	         if (al.get(i-1) > (al.get(i)) ) 
   	         {	 
   	         } 
   	         else 
   	         {
   	         return "No, the list is not in descending order.";
   	         }
   	      } 
   	      return "Yes, the list is in descending order.";
   	}
}