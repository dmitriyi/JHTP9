package ch04_test;

import java.util.Scanner;

public class Analysis {
	public static void main(String [] args) {

		int pass = 0;
		int fail = 0;
		int studentCounter = 1;

		Scanner in = new Scanner(System.in);

		while (studentCounter <= 10) {
			System.out.print("Enter Result:");
			int input = in.nextInt();

			if (input == 1) {
				pass += 1;
			} else if (input == 2) {
				fail += 1;
			} else {
				System.out.print("Incorrct input Try Again\n");
				studentCounter = studentCounter - 1;
			}
			studentCounter += 1;
		}

		System.out
				.printf("Number Of Students Passed : %s\nNumber Of Students Failed : %s\n",
						pass, fail);
		
		if (pass >= 8)
			System.out.print("Bonus to Instructor!");
	}
}
