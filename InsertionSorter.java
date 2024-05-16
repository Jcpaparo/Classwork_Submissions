
public class InsertionSorter
{

	public static void main(String[] args) 
	{
		//TASK 1: Create a method arrayShifter that when passed an array 
		//of ints, will take the last element and sort it into the right place. 
		//(Precondition: The array will be sorted except for the last element.)
		//Example input array and resulting array: {2, 5, 7, 8, 10, 6} -----> {2, 5, 6, 7, 8, 10}
		int[] arr1 = {2, 5, 7, 8, 10, 6};
		printArr(arrayShifter(arr1));
		
		//TASK 2: Change the previous method so that it is passed an int index
		//and will sort the value at that index instead of the last index.
		//(Precondition: the rest of the array will be sorted)
		//Example input and resulting array: ( {2, 4, 6, 8, 5, 10, 12} , 4 ) -----> {2, 4, 5, 6, 8, 10, 12}
		int[] arr2 = {2, 4, 6, 8, 5, 10, 12};
		int index = 4;
		printArr(arrayShifter2(arr2, index));
		
		//TASK 3: Create a method insertionSort (that is passed an int array) 
		//with a for loop that traverses the array from left to right. On each
		//iteration of the loop (in the work) write code that calls the 
		//arrayShifter method and passes it the array and the current loop index.
		int[] arr3 = {3, 6, 1, 7, 2, 10, 2};
		printArr(insertionSort(arr3));
		
	}

	/**
	 * method to traverse an array of ints from left to right using arrayShifter
	 * @return arr
	 */
	private static int[] insertionSort(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++)
		{
			arrayShifter2(arr, i);
		}
		return arr;
	}

	/**
	 * a method that sorts the index assuming rest of array is sorted
	 * @param arr1
	 * @param index 
	 * @return arr
	 */
	private static int[] arrayShifter2(int[] arr, int index) 
	{
		while (index > 0 && arr[index] < arr[index-1])
		{
			int hold = arr[index];
			arr[index] = arr[index-1];
			arr[index-1] = hold;
			index--;
		}
		
		return arr;
		
	}

	/**
	 * method that sorts the last index of the array
	 * @param arr
	 * @return arr
	 */
	private static int[] arrayShifter(int[] arr) 
	{
		int i = arr.length-1;
		while (i > 0 && arr[i] < arr[i-1])
		{
			int hold = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = hold;
			i--;
		}
		
		return arr;
	}
	
	
	/**
	 * this method is passed an array of doubles and prints out each element one by one
	 * @param arr
	 */
	public static void printArr(int[] arr) 
	{
		//declare a variable that traverses the array
		//task 1 - make a variable to be the traverser
		int trav;
		
		//task 2 - make a loop; we want it to traverse every character, so it
		//should go from start to finish of the loop
		System.out.print("{");
		for (trav = 0; trav <= arr.length-1; trav++) 
		{
			System.out.print(arr[trav]);
			//print comma for every element thats not the last
			if (trav != arr.length-1) 
			{
				System.out.print(", ");
			}
		}
		System.out.println("}");	
	}

}
