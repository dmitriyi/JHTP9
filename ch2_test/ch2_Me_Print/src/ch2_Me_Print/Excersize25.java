package ch2_Me_Print;
// Write an application that reads an integer and determines and prints whether it’s odd or even.
// [Hint: Use the remainder operator. An even number is a multiple of 2. 
// Any multiple of 2 leaves a remainder of 0 when divided by 2.]
import java.util.Scanner;

public class Excersize25 {
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		int n1,rem;
		
		System.out.print("Type your number: ");
			n1 = in.nextInt();
			
		rem = n1 % 2;
		
		if (rem == 0){
			System.out.printf("The number %d is even", n1);
		} else {
			System.out.printf("The number %d is odd", n1);
		}
		
	}
	
}
