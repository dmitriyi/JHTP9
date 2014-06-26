package ch04_test;

import java.util.Scanner;

public class GradeBook {
	private String courseName; // Course name Field
//	private int students;
	
	public GradeBook (String name){ //Constructor
		courseName=name;
//		students = studentNum;
	}

//	public int getStudents() {
//		return students;
//	}

//	public void setCourseName(String name) {
//		this.courseName = name;
//	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void displayMessage () {
		System.out.printf("Wlcome to the grade book for \n%s!\n\n",
				getCourseName());
	}
	
	public void determineClassAverage(){
		Scanner in = new Scanner(System.in);
		int total;
		int gradeCounter;
		int grade;
		double average;
		
		total = 0;
		gradeCounter = 0;
		
		System.out.print("Enter grade, or -1 to exit:");
		grade = in.nextInt();
		
		while (grade != -1 ) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			System.out.print("Enter grade, or -1 to exit: ");
			grade = in.nextInt();
		}
		
		if (gradeCounter != 0){
		
		average = total/ gradeCounter;
		System.out.printf("\nTotal of all %d grades is %d\n", gradeCounter, total );
		System.out.printf("Class average is %.2f\n", average);
		} else
			System.out.print("No grades were enetered");
		
	}
}
