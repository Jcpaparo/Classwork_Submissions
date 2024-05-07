
public class TwoDArrTrav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][] name = {{"Alice" , "Bob" , "Alicia", "Abby" , "Kai" , "Carl"},
						   {"Charlie", "David", "Lukas" , "Kennedy" , "Keanu" , "Fran"},
						   {"Ella" , "Fiona"  , "Paige" , "Nua" , "Kyla" , "Nainoa"},
						   {"Cade" , "Tryten" , "Takeo" , "Rydge" , "Aaron" , "Isaiah"},
						   {"Sam" , "Regina" , "Elizabeth" , "John" , "Joe" , "Mike"},
						   {"Luke"  , "Jhase" , "Pono" , "Nalu" , "Taum" , "Ian"},
						   {"Alex" , "Nico" , "Trip" , "Danny" ,  "Max" , "Zohair" }};
		
		double [][] arr = {{1.0,2.0,3.0},
							{4.0,5.0,6.0},
							{7.0,8.0,9.0}};
		
	//Task 1: Create a method print2DArray() that is passed a 2D String array and 
	//will print out each element in row-major order (instead of column-major order 
	//like we did yesterday). 						
	print2DArray(arr);
	
	print2DArray(allOne2D(arr));
		
		for (int i = 0; i < name.length; i++)
		{
			System.out.println(name [i][0]);
		}
		
		for (int i = 0; i < name[0].length ; i++)
		{
			System.out.println(name [0][i]);
		}
		
		for (int i = 0; i < name.length; i++)
		{
			for (int j = 0; j < name[0].length ; j++)
			{
				System.out.println(name [i] [j]);
			}
		}
		}

	private static double [][] allOne2D(double[][] arr) {
		// TODO Auto-generated method stub
		int x = arr[0].length;
		int y = arr.length;
		
		double [][] copyArr = new double [x][y];
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length ; j++)
			{
				copyArr [i] [j] = 1.0;
			}
		}
		return copyArr;
	}

	private static void print2DArray(double[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length ; j++)
			{
				System.out.println(arr [i] [j]);
			}
		}
	}
	}


