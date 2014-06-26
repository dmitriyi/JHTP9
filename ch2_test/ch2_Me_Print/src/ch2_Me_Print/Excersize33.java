package ch2_Me_Print;
// Create a BMI calculator that reads the user�s weight  and height,
// then calculates and displays the user�s body mass index. 
// Also, display the following information from the Department of Health 
// and Human Services/National Institutes of Health so the user can 
// evaluate his/her BMI:

import java.util.Scanner;

public class Excersize33 {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		
	System.out.print("This application will calculate your BMI.\nPlease enter your height in centimiters: ");
		float heightCm = in.nextFloat();
		float height = heightCm / 100;
		
	System.out.print("Please enter your weight in kilogramms: ");
		float wightKg = in.nextFloat();
	
		float bmi = wightKg / (height * height);
		
		String bmiType;
		
		if (bmi < 18.5){
			bmiType = "Underweight";
		}else if (bmi >= 18.5 && bmi <= 24.9){
			bmiType = "Normal";
		}else if (bmi >= 25 && bmi <= 29.9){
			bmiType = "Overweight";
		}else {
			bmiType = "Obese";
		}
		
	System.out.printf("Your current BMI is: %f - You might be %s", bmi, bmiType);
		
	System.out.printf("\n \nBMI VALUES\n "
			+ "Underweight: less than 18.5\n "
			+ "Normal:      between 18.5 and 24.9\n "
			+ "Overweight:  between 25 and 29.9 \n"
			+ "Obese:       30 or greater\n "
			+ "BMI value may not show acurate representation for athletes");
	

	}
}
