
public class Student {

		private double scienceGrade;
		private double mathGrade;
		private double theologyGrade;
		private int gradeLevel;
		private String name;
	
		public Student (double a, double b, double c, int d, String e)
		{
	scienceGrade =  a;
	mathGrade = b;
	theologyGrade =  c;
	gradeLevel = checkGrade(d);
	name = e;
		}
		
		private int checkGrade(int d) {
			// TODO Auto-generated method stub
			if ( d >= 1 && d <= 12)
			{
				return d;
		}
			else
			{
				return 0;
			}
		}

		public double getGPA()
		{
			double GPA = (scienceGrade + mathGrade + theologyGrade) / 3;
			return GPA;
		}
		
		public void introduceStudent ()
		
		{
			System.out.println("I am a student in grade " + gradeLevel + ". My name is " + name + ". My average GPA is " + getGPA() + ".");
		}
		
		
}
