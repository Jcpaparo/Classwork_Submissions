import java.util.Scanner;
public class inclassss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create and name scanner
		Scanner myReader = new Scanner (System.in);
		//make a string equal to what the user inputs
		String str = myReader.nextLine();
		//make a method to seperate the numbers from the rest of the string
		getNums(str);
		//close scanner
		myReader.close();
	}
	//create method that seperates the numbers from the d
	private static void getNums(String str) {
		// TODO Auto-generated method stub
		//create new string with first number inputted
		//start at beginning of str and include  everything  up to d
		String left = str.substring(0,str.indexOf("d"));
		//create new string for second number inputted
		//start at d  and include everything  until the end of the string
		String right = str.substring(str.indexOf("d") + 1,str.length());
		//print the two numbers
		System.out.println("Rolling D" + left + " " + right + " times");
		//create method to turn the strings with numbers in them into ints
		turnInt(left, right);
	}
	//create method that turns the strings into ints
	private static void turnInt(String left, String right) {
		// TODO Auto-generated method stub
		//make an int that's equal to the number the left string represents
		int a = Integer.valueOf(left);
		//make an int thats equal to the number the  right string represents
		int b = Integer.valueOf(right);
		//print the sum  of the ints
		//System.out.println(a + b);
		//call method that rolls dice and adds the results
		rollDice(a,b);
		
		
		
	}

	//create method that rolls dice, displays the output of each roll, and adds all rolls together
	private static void rollDice(int a, int b) {
		// TODO Auto-generated method stub
		//create int that will hold the value of the running count
		int hold = 0;
		//create loop that iterates the first number inputted times
		for (int i = 1; i < a + 1; i++) {
			//create int  that is equal to one roll
			int adder = (int)((double)Math.random() * b + 1);
			//print the result of the roll
			System.out.println(adder);
			//add the current roll to the running total
			hold += adder;
		}
		//print the sum of all rolls
		System.out.println(hold);
			
	}
}
