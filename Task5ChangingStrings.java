import java.util.Scanner;

public class Task5ChangingStrings 
{

	public static void main(String[] args) 
	{
		
		Character y = ' ';
		
		Scanner stringTaker = new Scanner(System.in);
		
		//tell user what to do 
		System.out.println("input any string or phrase and I will remove the spaces");
		
		//scan in string
		String str = stringTaker.nextLine();
		
		String xyz = "";
		
		countChar(str, y);
		
		int a = countChar(str,y);
		

		//call method to return the string without the spaces
		//print result
		System.out.println(removeSpaces(str, a, y));
		
		//close the scanner
		stringTaker.close();
		
	}

//method that checks the amount of times a char appears in a string
private static int countChar(String str, Character c) {
	// TODO Auto-generated method stub
	//number of times the char appears starts at 0
	int count = 0;
    // for loop that runs the check for each letter
	//will run as many times as there are chars in the string
    for(int i=0; i < str.length(); i++)
   //check if the char being checked is the char were checking for
   //uses a value that increases by 1 to change the letter being checked each time the code iterates
    {    if(str.charAt(i) == c)
    //add one to the count when it equals what we want
            count++;
    }
    //print the final count
    return count;
}

	

	private static String removeSpaces(String str, int a, char y) 
	{
		for (int i = 0; i < a; i++)
		{
		str = str.substring(0,(str.indexOf(y))) + str.substring((str.indexOf(y) + 1), str.length());
		}
		return str;
		
	}

}
