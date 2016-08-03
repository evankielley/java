import java.util.ArrayList;

public class scrap
{
	public static void main(String[] args)
	{
		ArrayList names = new ArrayList();
		
		names.add("Julia");
		names.add("Aria");
		names.add("George");
		names.add("Ana");
		
	    for (int i = 0; i < names.size(); i++) {
	        if(((String) names.get(i)).charAt(0) == 'A') {
	            names.remove(i);
	        }
	        if(((String) names.get(i)).charAt(0) == 'G') {
	            names.remove(i);
	        }
	        System.out.print(names.get(i));
	        System.out.print(" - ");
	    }
	    int[][] arr = {{1,1},{1,1}};
	    blah(arr);
		
	}
	public static void blah(int[][] arr)
	{
		System.out.println("whatup");
		
	}
}