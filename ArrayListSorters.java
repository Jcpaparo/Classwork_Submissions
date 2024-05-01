import java.util.ArrayList;

public class ArrayListSorters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList <Integer>();
		
		arr.add(0,4);
		arr.add(1,2);
		arr.add(2,9);
		arr.add(3,7);
		arr.add(4,1);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Abby");
		names.add("Karl");
		names.add("Kai");
		names.add("Fran");
		
		bubbleSortStrings(names);
		
		bubbleSortNumbers(arr);
	}
		

	private static void bubbleSortStrings(ArrayList<String> names) 
	{
		 for (int x = 0; x < names.size(); x++) 
	        {
	            for (int i = 0; i < names.size() - x - 1; i++) 
	            {
	                if (names.get(i).compareTo(names.get(i+1)) > 0)
	                {
	                    String hold = names.get(i);
	                    names.set(i, names.get(i + 1));
	                    names.set(i + 1, hold);
	                }
	            }
	        }
		 System.out.println(names);
	}


	private static void bubbleSortNumbers(ArrayList<Integer> nums) 
	{
		        for (int b = 0; b < nums.size(); b++) 
		        {
		            for (int i = 0; i < nums.size() - b - 1; i++) 
		            {
		                if (nums.get(i) > nums.get(i + 1))
		                {
		                    Integer hold = nums.get(i);
		                    nums.set(i, nums.get(i + 1));
		                    nums.set(i + 1, hold);
		                }
		            }
		        
			
		        }
		System.out.println(nums);
	}
	
	
}

