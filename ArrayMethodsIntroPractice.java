public class ArrayMethodsIntroPractice 
{
	public static void main(String[] args) 
	{
		int[] arr = {6, 8, 4, 10, 14, 18};
		divideByTwo(arr, 3);
		int[] x = giveFirstAndLastArray(arr);
	}
	
	
	public static void divideElementByTwo(int[] arr, int n)
	{
		arr[n] /= 2;
	}
	
	public static int[] giveFirstAndLastArray(int[] arr)
	{
		int[] x = {arr[0], arr[arr.length-1]};
		return x;
	}
}
