package ch04_test;

public class GradeBookTest {
	public static void main (String [] args){
		
		GradeBook myGradebook = new GradeBook("Intro To Java");
		
		myGradebook.displayMessage();
		myGradebook.determineClassAverage();
		
	}
}
