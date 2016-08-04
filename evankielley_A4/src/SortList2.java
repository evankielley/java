
public class SortList2
{
	public static void main(String[] args)
	{
		
		String[] arr = {"bob", "joe", "ann", "sue", "tom", "zita"};
		
		for (int a = 0; a < arr.length; a++)
		{
			int b = findNext(a);
			arr = order(arr, a, b);
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

/*
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[i].compareToIgnoreCase(arr[j]) < 0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	*/
	
	public static int findNext(int a)
	{
		if(a > 0)
		{
			int b = a++;
			return b;
		}
		else
		{
			int b = a;
			return b;
		}
	}
	
	public static String[] order(String[] arr, int a, int b)
	{
		if (arr[a].compareToIgnoreCase(arr[b]) < 0)
		{
			String temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		
			return arr;
		}
		else
		{
			return arr;
		}
	}
}