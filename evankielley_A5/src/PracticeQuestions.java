// I added the word "END" to the bottom of the questions.txt file to keep my code pretty.
// I have no idea why the counter doesn't work.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class PracticeQuestions
{
	public static NumberFormat formatter = new DecimalFormat("#0.0");     
	public static void main(String[] args) throws IOException
	{

		Scanner scan_choice = new Scanner(System.in);
		int choice = 0;	
		
		while (choice != 4) 
		{
			System.out.println("Enter one of the following commands to answer questions about that region (or hit 4 to exit):");
			System.out.println("1 - world");
			System.out.println("2 - canada");
			System.out.println("3 - atlantic");
			System.out.println("4 - exit");
			System.out.println();
			
			choice = scan_choice.nextInt();
			
		    if (choice == 1) 
		    {
		        String start_word = "THE WORLD";
		        String break_word = "CANADA";
		        findTheRegion(start_word, break_word);
		        
		    }
		    else if (choice == 2) 
		    {
		        String start_word = "CANADA";
		        String break_word = "NOVA SCOTIA";
		        findTheRegion(start_word, break_word);
		    }
		    else if (choice == 3) 
		    {
		    	String start_word = randomProvince();
		        String break_word = breakFromProvince(start_word);
		        System.out.println(start_word + " has been randomly selected.\n");
		        findTheRegion(start_word, break_word);
		    }
		    else if (choice == 4) 
		    {
		        break;
		    }
		    else
		    {
		        System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
		        choice = scan_choice.nextInt();
		    }
		}   
	}
	
	public static String randomProvince()
	{
		String arr[] = {"NOVA SCOTIA", "NEW BRUNSWICK", "PRINCE EDWARD ISLAND", "NEWFOUNDLAND AND LABRADOR"};
		Random random = new Random();
		int select = random.nextInt(arr.length - 1);
		String random_province = arr[select];
		return random_province;
	}
	
	public static String breakFromProvince(String random_province)
	{
		if (random_province.equals("NOVA SCOTIA"))
		{
			return "NEW BRUNSWICK";
		}
		else if (random_province.equals("NEW BRUNSWICK"))
		{
			return "PRINCE EDWARD ISLAND";
		}
		else if (random_province.equals("PRINCE EDWARD ISLAND"))
		{
			return "NEWFOUNDLAND AND LABRADOR";
		}
		else
		{
			return "END";
		}
	}
	
	public static void findTheRegion(String start_word, String break_word) throws IOException
	{
		Scanner user_input = new Scanner(System.in);
		BufferedReader read = new BufferedReader(new FileReader("questions.txt"));
		String line = "";
		ArrayList<String> questions = new ArrayList<String>();
		ArrayList<String> answers = new ArrayList<String>();
		double counter = 0.0;
		
		while (!line.contains(break_word))
		{
			line = read.readLine();
			if (line.contains(start_word))
			{
				while (!line.contains(break_word))
				{
					line = read.readLine();
					String[] split = line.split(">>");
					questions.add(split[0]);
					answers.add(split[1]);
				}
				for (int i = 0; i < (questions.size() - 1); i++)
				{
					
					System.out.println(questions.get(i));
					String user_answer = user_input.nextLine();
					if (user_answer.toLowerCase().equals(answers.get(i).toLowerCase()))
					{
						System.out.println("Correct!");
						counter++;	
					}
					else
					{
						System.out.print("No, the answer is: ");
						System.out.println(answers.get(i));
			
					}
				}
			}
		}

		double grade = ((counter / (questions.size()-2.0)) * 100);
		System.out.println("\nYou got " + formatter.format(grade) + "% correct");
		System.out.println();
	}
}