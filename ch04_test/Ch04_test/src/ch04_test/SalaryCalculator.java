package ch04_test;

import java.util.Scanner;

public class SalaryCalculator {
	public static void main (String [] args){
		String sEmployeeNumber, sHours, sHourlyPay, terminated = "Terminated!";
		int iHours, quit = 0;
		double dHourlyPay, dGrossPay;
		
		Scanner in = new Scanner(System.in);
		System.out.printf("Welcome to the Salary Calculator!\nto exit please type \"quit\"\n");
		
		while (quit != 1){
			System.out.printf("Please enter the employee number:");
					sEmployeeNumber = in.nextLine();
				if (sEmployeeNumber .equals("quit")){
					quit = 1;
					System.out.printf(terminated);
				} else {
					System.out.printf("Please enter the hours employee %s worked this week:", sEmployeeNumber);
						sHours = in.nextLine();
					if (sHours .equals("quit")){
						quit = 1;
						System.out.printf(terminated);
					} else {
						System.out.printf("Please enter the hours employee %s's hourly rate:", sEmployeeNumber);
							sHourlyPay = in.nextLine();
						if (sHourlyPay .equals("quit")){
							quit = 1;
							System.out.printf(terminated);
						} else {
							iHours = Integer.parseInt(sHours);
							dHourlyPay = Double.parseDouble(sHourlyPay);
							if (iHours > 40){		
								int remains = iHours - 40;
							dGrossPay = ((dHourlyPay*1.5)* remains) + (dHourlyPay *40);
							}
						}
				}
				
//	If hoursWorked > 40
//	remains = hoursWorked - 40
//	pay = ((hourlyRate*1.5) * remains) + (hourlyRate * 40)
//	else
//	pay = hourlyRate * hoursWorked
//	}
//
//	Print Employee %S will receive the salary of %spay
	
	}
}
}
//System.out.printf();