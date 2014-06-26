package ch2_Me_Print;
import java.util.Scanner;
//Importing a method from outside packege
// all imports must be declared before the class declarations


public class Addition {
public static void main (String[] args){
	Scanner input = new Scanner( System.in);
//	int number1;
//	int number2;
//	int sum;
	//Same as =
	int number1,
	number2,
	number3,
	sum;
	
	System.out.print("Enter First Integer: ");
	number1 = input.nextInt();
		
	System.out.print("Enter second Integer: ");
	number2 = input.nextInt();
	
	System.out.print("Enter third Integer: ");
	number3 = input.nextInt();
	
	if (number3 == 0) {
		System.out.print("Cannot devide by 0");
	}
	if (number3 != 0){
	sum = (number1 + number2) / number3;
	
	System.out.printf("Result of (A+B)/C is: %d\n", sum);
	}
	// this calculator is buggy - inputing non Int will result in crash
	// "input" variable is never killed causing a memory leak!
	}
}
