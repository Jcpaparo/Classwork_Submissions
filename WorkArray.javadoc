
public class WorkArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] arr = { 3.1, 2.1, 8.4};
		int [] nums = { 3, 17, 12, 8, 9, 4, 12 };
		System.out.println(SumArrElements( arr ));
		
		int [] brr = MakeEveryOther( nums );
		
		printArr(brr);
	}

	private static int[] MakeEveryOther(int[] nums) {
		// TODO Auto-generated method stub
		
		
		for ( int i = 1; i <= nums.length - 1; i+= 2)
		{
			nums[i] = 1;
		}
		
		return nums;
	}

	private static double SumArrElements(double[] arr) {
		// TODO Auto-generated method stub
		double a = 0;
		
		for ( int i = 0; i <= arr.length - 1; i++)
		{
			a += arr[i];
		}
		return a;
	}
	public static void printArr ( int[] arr )
	{
		
		for ( int i = 0; i <= arr.length - 1; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
