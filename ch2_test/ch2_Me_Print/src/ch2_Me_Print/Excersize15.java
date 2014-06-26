package ch2_Me_Print;

import java.util.Scanner	;

public class Excersize15 {

	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		int n1,
		n2,
		sum,
		mult,
		dif,
		div;
		
		System.out.print("We will take two numbers and give you results of their\nsum, multiplication, division and difference!"
				+ "\n \nEnter first integer: ");
			n1 = input.nextInt();
			
		System.out.print("Enter Second integer: ");
			n2 = input.nextInt();
				if (n2 == 0) {
					System.out.println("Will not devide by 0");
				}
				if (n2 !=0){
					sum = n1 + n2;
					mult = n1 * n2;
					dif = n1 - n2;
					div = n1/n2;
					
					System.out.printf("Sum is:       %d\n", sum);
					System.out.printf("Product is:   %d\n", mult);
					System.out.printf("Division is:  %d\n", div);
					System.out.printf("Diference is: %d\n", dif);
				}
		
	}
	
}
