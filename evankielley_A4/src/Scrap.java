import java.util.Scanner;
public class Scrap
{
	public static void main( String[] args ){
		int [] a = {1, 3, 5, 7};               //LINE 1
		System.out.println("Original array:"); //LINE 2
		printArray(a);                         //LINE 3
		System.out.println();                  //LINE 4
		System.out.println("Modified array:"); //LINE 5
		modify(a);                             //LINE 6
		printArray(a);                         //LINE 7
		}
		public static void modify(int[] b){        //LINE 8
		for (int j=0; j<b.length; j++) {       //LINE 9
		b[j] = (int)(Math.pow(b[j],2));    //LINE 10
		}
		}
		public static void printArray(int[] c){    //LINE 11
		for(int i=0; i<c.length; i++){         //LINE 12
		System.out.print("| " + c[i]);     //LINE 13
		}
		System.out.println();                  //LINE 14
		}
}