/**
 * Methods that traverse methods and pull certain elements and attributes out  of arrays
 * John Paparo
 */
public class TraversalMethodsHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =	{ 1, 6, 3, 9, 1, 1, 4};
		
		double[] arr1 = { 3.1, 4.2, 5.0, 6.2, 6.9};
		
		int[] arr2 = { 1, 6, 9};
		
		int[] arr4 = { 3, 6, 8};
		
		double[] arr3 = { 2.0, 8.8, 8.8, 8.8, 9.0, 3.1};
		
		System.out.println(findHighest(arr));
		
		System.out.println(findAvg(arr1));
		
		System.out.println(checkEven(arr2));
		
		System.out.println(checkAllEven(arr4));
		
		CheckThreeSame( arr3);
	}
	/*
	 * Make a method that is passed an int array and returns whether or not the array has any even numbers in it.
	 * @param arr2
	 * @return boolean
	 */
	public static boolean checkEven (int[] arr)
	{
		int trav;
		for (trav = 0; trav < arr.length; trav++) 
		{
			if (arr[trav] % 2 == 0) 
			{
				return true;
			}
		}
		return false; 
	}
	/**
	 * Make a method that is passed an int array and returns whether or not the array has ALL even numbers in it.
	 * @param arr4
	 * @return boolean
	 */
	public static boolean checkAllEven (int[] arr)
	{
		int count = 0;
		int trav;
		for (trav = 0; trav < arr.length; trav++) 
		{
			if (arr[trav] % 2 == 0) 
			{
				count ++;
			}
		}
		if (count == arr.length)
		{
			
			return true;
		}
		return false; 
	}
	/**
	 * Make a method that is passed an array of doubles and returns a double that is equal to their average. 
	 * @param arr1
	 * @return double
	 */
	private static double findAvg(double[] arr1) {
		// TODO Auto-generated method stub
		double count =  0;
		for (int i = 0; i < arr1.length; i++)
		{
			count += arr1[i];
		}
		count = count/arr1.length;
		return count;
	}
	/**
	 * Make a method that is passed an int array and returns the highest value in that array.
	 * @param arr
	 * @return int
	 */
	private static int findHighest(int[] arr) {
		// TODO Auto-generated method stub
			int max = arr[0];
			int trav;
			for (trav = 1; trav < arr.length; trav ++)
			{
				if (arr[trav] > max)
				{
					max = arr[trav];
				}
			}
			
			
			return max;
	}
			
	/**
	 * Make a method that is passed a double array and returns whether or not three consecutive doubles of the same value appear in the array.
	 * @param arr3
	 * @return boolean
	 */
	public static boolean CheckThreeSame(double[] arr3) {
		
		
		int trav = 0;
		boolean  hasThree = false;
		for (; trav < arr3.length - 3; trav++)
			
		{
			if (arr3[trav] == arr3[trav + 1] && arr3[trav] ==  arr3[trav + 2]);
			{
				hasThree = true;
			}
			
		}
		return hasThree;
	}
	
}

	
