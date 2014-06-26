package ch3_Grade;
// Create a BMI calculator that reads the user’s weight  and height,
// then calculates and displays the user’s body mass index. 
// Also, display the following information from the Department of Health 
// and Human Services/National Institutes of Health so the user can 
// evaluate his/her BMI:

public class Bmi_Class {
	private double height;
	private double weight;
	private String bmiType;
	private double bmi;
	
	public Bmi_Class (double heightCm, double weightKg){
	height = heightCm / 100;
	weight = weightKg;
	}
	
		
	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getBmiType() {
		return bmiType;
	}


	public void setBmiType() {
		if (bmi < 18.5){
			bmiType = "Underweight";
		}else if (bmi >= 18.5 && bmi <= 24.9){
			bmiType = "Normal";
		}else if (bmi >= 25 && bmi <= 29.9){
			bmiType = "Overweight";
		}else {
			bmiType = "Obese";
		}
	}


	public double getBmi() {
		return bmi;
	}


	public void setBmi() {
		this.bmi = weight / (height * height);
	}
		
		
	public void bmiOut() {		
//	System.out.printf("Your current BMI is: %.2f - You might be %s", getBmi(), getBmiType());
	System.out.printf("\n \nBMI VALUES\n "
			+ "Underweight: less than 18.5\n "
			+ "Normal:      between 18.5 and 24.9\n "
			+ "Overweight:  between 25 and 29.9 \n"
			+ "Obese:       30 or greater\n "
			+ "BMI value may not show acurate representation for athletes");
		}
		
}// End Class
