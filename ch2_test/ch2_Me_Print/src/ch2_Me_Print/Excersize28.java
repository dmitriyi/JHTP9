package ch2_Me_Print;

import java.util.Scanner;

// Write an application that inputs from the user the radius of a circle
// as an integer and prints the circle’s diameter, circumference 
// and area using the floating-point value 3.14159 for Pi. 
// Use the techniques shown in Fig. 2.7. 
public class Excersize28 {

	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		float rad;
		
		System.out.print("Enter the radius");
			rad = in.nextFloat();
		
		
		System.out.printf("Diamerer is: %f\n", 2 * rad);
		System.out.printf("Circumference is: %f\n", 2 * Math.PI * rad);
		System.out.printf("Area is: %f\n", Math.PI * rad * rad);
	}	
}
