
public class BuildingInsertionSort {

	public static void main(String[] args) {
		
		//declare int array that is equal to the array made by the method makeRandom
		int [] arr = makeRandom();
		//call bubbleSort and pass it our array
		bubbleSort(arr);
		//print the sorted array
		printArr2(arr);
		
	}

private static int[] makeRandom() {
		
	
		//create an empty array with 2000 elements
		int[] bigNums = new int[2000]; 
		//create an int that is equal to the length of the array
		int len = bigNums.length; 
		//for loop that runs as many times as the array is long
		for (int i = 0; i < len; i++)
		{
			//create a random number then multiply it by 1000 and add 1
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			//the element at the current index is equal to the random number
			bigNums[i] = randomNumber; 
			
		}
		//return int full of random numbers
		return bigNums;
	}
	
	public static void bubbleSort(int[] arr)
	{
		//for loop that runs equal to the amount of elements  - 1 in an array
		for (int i = 0; i < arr.length; i++) 
		{
			//for loop that runs equal to the amount of elements - 2 in an array
			for (int j = 0; j < arr.length-1; j++) 
			{
				//checks if the element at the current index is bigger than the element in front of it
				if (arr[j] > arr[j+1]) 
				{ 
					//declare an int that is equal to the element at our index + 1
					int holder = arr[j + 1];
					//sets the element equal to the element before it
					arr[j + 1] = arr[j];
					//fills in the element we just replaced
					arr[j] = holder;
				}
			}
		}
	}
	public static void printArr2 ( int[] arr )
	{
		//for loop that runs equal to the length of the array
		for ( int i = 0; i <= arr.length - 1; i++)
		{
			//prints the element at the current index
			System.out.println(arr[i]);
		}
	}
}
