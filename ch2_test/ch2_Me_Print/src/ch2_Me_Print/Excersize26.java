package ch2_Me_Print;
//  (Multiples) Write an application that reads two integers, 
// determines whether the first is a multiple of the second and prints the 
// result. [Hint: Use the remainder operator.] 

import java.util.Scanner;

public class Excersize26 {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		
		int n1, n2, div, rem;
		
		System.out.print("Enter the first number: ");
			n1 = in.nextInt();
		System.out.print("Enter the second number: ");
			n2 = in.nextInt();
		
		div = n1 / n2;
		rem = n1 % n2;
//		System.out.print(rem);
		
		if (rem == 0) {
			System.out.printf("The %d is an exact multiple of %d", n1, n2);
		} else {
			System.out.printf("The %d is an NOT an exact multiple of %d", n1, n2);
		}
		
	}
}
