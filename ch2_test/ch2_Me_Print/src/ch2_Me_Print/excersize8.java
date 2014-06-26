package ch2_Me_Print;

//This program will preform a payroll calculations
import java.util.Scanner;

public class excersize8 {

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		int n1,
		n2,
		sum;
		
		System.out.print("Enter an interer: ");
		n1 = input.nextInt();
		
		System.out.print("Enter an second: ");
		n2 = input.nextInt();
		
		sum = n1 * n2;
		System.out.print(sum);
	
	}
}
