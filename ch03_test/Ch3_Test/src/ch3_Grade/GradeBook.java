package ch3_Grade;

// a) Include a String instance variable that represents the name of the course�s instructor. 
// b) Provide a set method to change the instructor�s name and a get method to retrieve it. 
// c) Modify the constructor to specify two parameters�one for the course name and one for the instructor�s name. 
// d) Modify method displayMessage to output the welcome message and course name, followed by 
// "This course is presented by: " and the instructor�s name. Use your modified class
// in a test application that demonstrates the class�s new capabilities. 


public class GradeBook {
	//Fields here:
	private String courseName;	//Course name field
	public String instructorName;	// Instructor Name field
	
	public GradeBook (String name, String instructor) { // A constructor name is a class name
				// If quick fix is used make sure to create it as Constructor or Compile Error occurs
		courseName = name;
		instructorName = instructor;
	}

// Instructor Name Methods here:
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public String getInstructorName() {
		return instructorName;
	}

	
// Course name methods here:
	public void setCourseName (String name){ // Method to SET the courseName
		courseName = name; // Store the course name
	}
	public String getCourseName (){  // Method to retrieve the course name
		return courseName;
	}
	
	public void   displayMessage(  ){ // Welcome display message method
		
		// Calls the getCourseName to get the name of the course
		System.out.printf("Welcome to the Grade Book for\n%s!\n This course is presented by: %s", getCourseName(), getInstructorName() );
}
}
