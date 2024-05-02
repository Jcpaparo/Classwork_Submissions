import java.util.ArrayList;

public class ArrayListMethodsPractice {

	public static void main(String[] args) 
	{
		
		ArrayList<String> foods = new ArrayList<String>();
		System.out.println(foods.size());
		
		foods.add("Apples");
		System.out.println(foods.size());

		foods.add("Bread");
		System.out.println(foods.size());

		foods.add("Cookies");
		System.out.println(foods.size());

		//Task 1: Print out the length of the foods ArrayList. 
		System.out.println(foods.size());

		//Task 2: Inside of a print statement, add the String "Dole Whip" to 
		//foods. In the line comment for this code, state what it prints.
		
		//this prints true
		System.out.println(foods.add("Dole Whip"));

		//Task 3: Inside of a print statement, use the .set(E) method to 
		//change "Bread" in foods to "Butter". Comment what it prints. 
		
		//prints  "bread"
		System.out.println(foods.set(1, "Butter"));
		
		//Task 4: Inside of a print statement, use the .remove(int) method
		//to remove "Cookies" from foods. Comment what it prints.
		
		//prints cookies
		System.out.println(foods.remove(2));


	}

}
