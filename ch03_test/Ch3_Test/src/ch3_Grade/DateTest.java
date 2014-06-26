package ch3_Grade;

import javax.swing.JOptionPane;

public class DateTest {
	public static void main (String [] args){
		String dayS = JOptionPane.showInputDialog("Please Enter the day: ");
		int day = Integer.parseInt(dayS);
		String monthS = JOptionPane.showInputDialog("Please Enter the month: ");
		int month = Integer.parseInt(monthS);
		String yearS = JOptionPane.showInputDialog("Please Enter the year: ");
		int year = Integer.parseInt(yearS);
		
		Date date1 = new Date(day, month, year);
		
		date1.displayDate();
		
		  
	}
}
