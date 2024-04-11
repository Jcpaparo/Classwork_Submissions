
public class BuildingInsertionSort {

	public static void main(String[] args) {
		
		
		int [] arr = makeRandom();
		bubbleSort(arr);
		printArr2(arr);
		
	}

private static int[] makeRandom() {
		
		int[] bigNums = new int[2000]; 
		int len = bigNums.length; 
		for (int i = 0; i < len; i++)
		{
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			bigNums[i] = randomNumber; 
			
		}
		return bigNums;
	}
	
	public static void bubbleSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length-1; j++) 
			{
				if (arr[j] > arr[j+1]) 
				{ 
					int holder = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = holder;
				}
			}
		}
	}
	public static void printArr2 ( int[] arr )
	{
		
		for ( int i = 0; i <= arr.length - 1; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
