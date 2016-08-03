import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StudentGPAs
{
	public static ArrayList<String> students = new ArrayList<String>();
	public static ArrayList<Integer> student_numbers = new ArrayList<Integer>();
	public static ArrayList<Double> quiz_marks = new ArrayList<Double>();
	public static ArrayList<Integer> quiz_gpa = new ArrayList<Integer>();
	public static ArrayList<Double> average_gpa = new ArrayList<Double>();
	public static int number_of_students = 4;
	public static int number_of_quizzes = 5;
	
	public static void main(String[] args) throws IOException
	{
		try 
		{
			BufferedReader file_input = new BufferedReader(new FileReader("students.txt"));
			String line;
			
			while((line = file_input.readLine()) != null)
			{
				String[] split_line = line.split("\\s+");
				String student = split_line[0];
				students.add(student);
				String temp_student_number = split_line[1];
				int student_number = Integer.parseInt(temp_student_number);
				student_numbers.add(student_number);
				
				for(int i = 2; i < (number_of_quizzes + 2); i++)
				{
					String temp_quiz_mark = split_line[i];
					Double quiz_mark = Double.parseDouble(temp_quiz_mark);
					quiz_marks.add(quiz_mark);
				}
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("File I/O error while reading from file.");
		}
		
		for(int i = 0; i < quiz_marks.size(); i++)
		{
			if(quiz_marks.get(i) >= 80)
			{
				quiz_gpa.add(4);
			}
			else if(quiz_marks.get(i) >= 65 && quiz_marks.get(i) < 80)
			{
				quiz_gpa.add(3);
			}
			else if(quiz_marks.get(i) >= 55 && quiz_marks.get(i) < 65)
			{
				quiz_gpa.add(2);
			}
			else if(quiz_marks.get(i) >= 50 && quiz_marks.get(i) < 55)
			{
				quiz_gpa.add(1);
			}
			else
			{
				quiz_gpa.add(0);
			}
		}
				
		for(int i = 0; i < number_of_students; i++)
		{
			double sum = 0;
			double average = 0;
			
			for(int j = (i * number_of_quizzes); j < ((i + 1) * number_of_quizzes); j++)
			{
				sum += quiz_gpa.get(j);
				average = sum / number_of_quizzes;
			}
			average_gpa.add(average);
		}
		
		for(int i = 0; i < number_of_students; i++)
		{
			System.out.println("Student Number: " + student_numbers.get(i) + " GPA: " + average_gpa.get(i));
			try 
			{
			    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("classGPA.txt", true)));
			    out.println("Student Number: " + student_numbers.get(i) + " GPA: " + average_gpa.get(i));
			    out.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
				System.out.println("File I/O error while writing to file.");
			}
		}
	}	
}