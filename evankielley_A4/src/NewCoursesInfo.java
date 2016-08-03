import java.util.Scanner;

public class NewCoursesInfo
{
	
	public static String[] courses = {"CS101", "CS105", "CS110", "CS115", "CS120"};
	public static String[] students = {"Andy Pandy", "Benny Menny", "Kim Simms", "Rolly Polly", "Cindy Mindy", "Geeta Peeta"};
	public static int row = 5;
	public static int col = 6;
	public static int[][] marks = new int[row][col];
	public static Scanner userInput = new Scanner (System.in);
	
	public static void main(String[] main)
	{
		marks = initializeMarks(userInput, marks);
		computeAllRanges();
		System.out.println();
		computeAllAverages(students, marks);
	}
	public static int[][] initializeMarks(Scanner userInput, int[][] marks)
	{
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				marks[i][j] = userInput.nextInt();
			}
		}
		return marks;
	}
	public static void computeAllRanges()
	{
		printRangeForCourse(courses);
	}
	public static int findMinForRow(int[][] marks, int i)
	{
		int min = 100;
		
		for(int j = 0; j < col; j++)
		{
			if(marks[i][j] < min)
			{
			min = marks[i][j];	
			}			
		}
	return min;		  
	}
	
	public static int findMaxForRow(int[][] marks, int i)
	{

		int max = 0;
		
		for(int j = 1; j < col; j++)
		{
			if(marks[i][j] > max)
			{
			max = marks[i][j];	
			}			
		}
	return max;		  
	}

	public static void printRangeForCourse(String[] courses)
	{
		System.out.format("%-16s%16s", "Courses", "Range of Marks");
		System.out.println();
		
		for(int i = 0; i < row; i++)
		{
			int min = findMinForRow(marks, i);
			int max = findMaxForRow(marks, i);
			int range = max - min;
			System.out.format("%-16s%16d", courses[i], range);
			System.out.println();
		}
	}
	public static void computeAllAverages(String[] students, int[][] marks)
	{
		System.out.format("%-16s%16s", "Student Name", "Average Marks");
		System.out.println();
		
		for(int i = 0; i < col; i++)
		{
			int sum = 0;
			double avg = 0;
			
			for(int j = 0; j < row; j ++)
			{
				sum += marks[j][i];
				avg = sum / row;
			}
		System.out.format("%-16s%16d", students[i], (int)avg);
		System.out.println();
		}
	}
}