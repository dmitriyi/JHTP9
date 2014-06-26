// Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. 
// The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon 
// obtained for all trips up to this point. All averaging calculations should produce floating-point results. Use class Scanner 
// and sentinel-controlled repetition to obtain the data from the user.

package ch04_test;

import javax.swing.JOptionPane;

public class GasMilageAverage {
	public static void main(String[] args) {
		// Declaring and initializing variables
		int miles = 0, gallons = 0, counter = 0, quit = 0;

		double sum = 0, mpg, average;

		// Application Greeting
		JOptionPane
				.showMessageDialog(
						null,
						"This application will calculate the average MPG! \n Enter \"quit\" instead of your milage when done");

		// Loop that calculates the MPG and sum for all the trips
		while (quit != 1) {
			String sMiles = JOptionPane
					.showInputDialog("Please enter Miles in a trip (to exit enter \"quit\"):");
			if (sMiles.equals("quit")) {
				quit = 1;
			} else {
				miles = Integer.parseInt(sMiles);
				String sGallons = JOptionPane
						.showInputDialog("Please enter Gallons used in a trip:");
				gallons = Integer.parseInt(sGallons);
				GasMilage myTrip = new GasMilage(miles, gallons);
				myTrip.setMpg();
				mpg = myTrip.getMpg();
				System.out.printf("Mpg For your last trip is %.2f \n", mpg);
				sum += mpg;
				++counter;
			}
		}

		average = sum / counter;
		System.out.printf("You had entered %s trips! \nAverage MPG is: %.2f",
				counter, average);
	}
}
