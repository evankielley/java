public class SortList
{	
	public static void main(String[] args)
	{
		String[] names = {"bob", "joe", "ann", "sue", "tom", "zita"};
		for (int i = 0; i < 1; i++)
		{
			printArray(order(names, i, findNext(names, i)));
		}	
	}

	
	public static void printArray(String[] names)
	{
		for (int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
	}
	
	public static String[] order(String names[], int something, int tempIndex)
	{
		String temp;
		
		for (int i = 0; i < names.length ; i++)
		{
			int indexToSwap = findNext(names, i);
			temp = names[i];
			names[i] = names[indexToSwap];
			names[indexToSwap] = temp;
		}
		

		return names;
	}
	
	public static int findNext(String[] names, int firstIndex)
	{
		String temp;
		int indexToSwap = 0;
		
		for (int i = firstIndex; i < names.length - 1; i++)
		{
			if (names[firstIndex].compareToIgnoreCase(names[firstIndex + 1]) > 0)
			{
				temp = names[firstIndex];
				names[firstIndex] = names[firstIndex + 1];
				names[firstIndex + 1] = temp;
				indexToSwap = i;
			}
		}
		return indexToSwap;
	}
		
}
	
/*
 * 	public static void main(String[] args)
	{
		
		String[] arr = {"bob", "joe", "ann", "sue", "tom", "zita"};

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
