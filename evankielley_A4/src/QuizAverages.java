import java.util.ArrayList;
import java.util.Scanner;
public class QuizAverages
{
	public static void main(String[] args)
	{
		Scanner user_input = new Scanner(System.in);
		ArrayList<String> student_names = new ArrayList<String>();
		ArrayList<Double> quiz_total = new ArrayList<Double>();
		ArrayList<ArrayList<Integer>> all_marks = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < 5; i++)
		{
			student_names.add(user_input.nextLine());
			all_marks.add(makeListOfQuizScores());
			double weight = findQuizAverage(all_marks.get(i));
			quiz_total.add(weight);		
		}
			printNamesAndMarks(student_names, quiz_total);
	}
	
	public static ArrayList<Integer> makeListOfQuizScores()
	{
		Scanner user_input = new Scanner(System.in);
		ArrayList<Integer> mark = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++)
		{
			mark.add(user_input.nextInt());
		}
		
		return mark;
	}
	
	public static double findQuizAverage(ArrayList<Integer> mark)
	{
		int sum = 0;
		int total_quiz_weight = 15;

		for (int i = 0; i < 5; i++)
		{
			sum += mark.get(i);
		}
		
		double average = sum / 5;
		double weight = total_quiz_weight * (average / 100);
		
		return weight;
	}
	
	public static void printNamesAndMarks(ArrayList<String> student_names, ArrayList<Double> quiz_total)
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Name: " + student_names.get(i) + "   Quiz Avg: " + quiz_total.get(i));
		}
	}
}