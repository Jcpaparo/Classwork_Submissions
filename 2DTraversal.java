
public class 2DTraversal
{
	public static void main(String[] args) 
	{
		//TASK 1
		String[][] arr = {{"fl", "eh", "fl", "eh", "fl", "eh"},
						  {"he", "qi", "he", "qi", "he", "qi"},
						  {"dy", "ds", "dy", "ds", "dy", "ds"},
						  {"fl", "eh", "fl", "eh", "fl", "eh"},
						  {"he", "qi", "he", "qi", "he", "qi"},
						  {"dy", "ds", "dy", "ds", "dy", "ds"},
						  {"fl", "eh", "fl", "eh", "fl", "eh"}};
		
		//Task 3
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i][0]);
		}
		
		//Task 5
		for (int i = 0; i < arr[0].length; i++)
		{
			System.out.print(arr[0][i]);
		}
		
		//Task 6
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length; j++)
			{
				System.out.print(arr[i][j]);
			}
		}
	}
}
