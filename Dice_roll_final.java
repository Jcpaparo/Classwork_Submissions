import java.util.Scanner;

public class Dice_Roll_Papi 
{

	public static void main(String[] args) 
	{
		Scanner stringTaker = new Scanner(System.in);
		
		//tell user what to do 
		System.out.println("input any string or phrase and I will remove the spaces");
		
		//scan in string
		String str = stringTaker.nextLine();
		Character delete = ' ';
		Character plus = '+';
		int a = countChar(str, delete);
		int b = countChar(str, plus);
		//call method to return the string without the spaces
		//print result
		String strntn = removeSpaces(str, a, delete);
		
		getNums(strntn, b);
		
		
		
		//close the scanner
		stringTaker.close();

	}
	//create method that seperates the numbers from the d
		private static void getNums(String str, int a) {
			// TODO Auto-generated method stub
			for (int i = 0; i < a; i++)
			{
			String xyz = str.substring(0,str.indexOf('+'));
			
			//create new string with first number inputted
			//start at beginning of str and include  everything  up to d
			String left = xyz.substring(0,xyz.indexOf("d"));
			//create new string for second number inputted
			//start at d  and include everything  until the end of the string
			String right = xyz.substring(xyz.indexOf("d") + 1,xyz.length());
			//print the two numbers
			System.out.println("Rolling D" + right + " " + left + " times");
			//create method to turn the strings with numbers in them into ints
			turnInt(left, right);
			
			str = str.substring(str.indexOf('+') + 1,str.length());
			
			}
			
			String xyz = str;
			
			//create new string with first number inputted
			//start at beginning of str and include  everything  up to d
			String left = xyz.substring(0,xyz.indexOf("d"));
			//create new string for second number inputted
			//start at d  and include everything  until the end of the string
			String right = xyz.substring(xyz.indexOf("d") + 1,xyz.length());
			//print the two numbers
			System.out.println("Rolling D" + right + " " + left + " times");
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
			System.out.println("The total of your rolls is " + hold);
				
		}
		
		private static int countChar(String str, Character c) {
			// TODO Auto-generated method stub
			//number of times the char appears starts at 0
			int count = 0;
		    // for loop that runs the check for each letter
			//will run as many times as there are chars in the string
		    for(int i = 0; i < str.length(); i++)
		   //check if the char being checked is the char were checking for
		   //uses a value that increases by 1 to change the letter being checked each time the code iterates
		    {    if(str.charAt(i) == c)
		    //add one to the count when it equals what we want
		            count++;
		    }
		    //print the final count
		    return count;
		}



		
		private static String removeSpaces(String str, int a, Character y) 
		{
			for (int i = 0; i < a; i++)
			{
			str = str.substring(0,(str.indexOf(y))) + str.substring((str.indexOf(y) + 1), str.length());
			}
			return str;
			
		}
