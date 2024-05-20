
public class 2DTraversal 
{
	public static void main(String[] args) 
	{
		//Task 1
		String[][] arr = {{"a", "b", "c", "d", "e", "f"},
						  {"g", "h", "i", "j", "k", "l"},
						  {"m", "n", "o", "p", "q", "r"},
						  {"s", "t", "u", "v", "w", "x"},
						  {"y", "z", "aa", "bb", "cc", "dd"},
						  {"ee", "ff", "gg", "hh", "ii", "jj"},
						  {"kk", "ll", "mm", "nn", "oo", "pp"}};
		
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
