import java.util.Scanner;
import java.util.ArrayList;

public class AvgTime
{ 
   private static double sum;
   private static double avg;
   private static double time;
   private static int id;
   private static Scanner userInput = new Scanner(System.in);
   private static int bob;
   
	public static void main(String args[])
	{
		ArrayList<Integer> alID = new ArrayList<Integer>();
		ArrayList<Double> alAVG = new ArrayList<Double>();
		
		for (int i = 0; i < 3; i++)
		{
			bob = id();
			
			if (bob == 0)
			{
				break; 
			}
			else
			{
			alID.add(bob);
			alAVG.add(avg());
			}
		}
		
		for (int j = 0; j < alAVG.size(); j++)
		{
			System.out.println("Runner ID: " + alID.get(j) + "    Avg Time: " + alAVG.get(j));
		}
	}
	
	public static int id()
	{
		System.out.println("Input Runner ID: ");
		id = userInput.nextInt();	
		return id;
	}
	
	public static double avg()
	{
	    ArrayList<Double> al = new ArrayList<Double>();
	    sum = 0;
	    avg = 0;
		
		for (int j = 0; j < 8; j++)
		{
			System.out.println("Input your lap time for run #" + (j+1));
		    time = userInput.nextDouble();
		    al.add(time); 
		    
		    sum += al.get(j);
		    avg = sum / 8;
	    }
		return avg;
	}
	
}