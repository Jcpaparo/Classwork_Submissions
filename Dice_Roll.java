
public class Dice_Roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for (int i = 1; i <201; i++) {
		//System.out.println((int)((double)Math.random() * 17 + 1));
	//}
		//string were  checking for the letter
		String x = "BBBBYHYBUH";
		//letter were checking for
		Character y = 'B';
		//call the method with the string and char included
		countChar(x, y);
		}
	
//method that checks the amount of times a char appears in a string
	private static void countChar(String str, Character c) {
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
	    System.out.println(count);
	}
}
