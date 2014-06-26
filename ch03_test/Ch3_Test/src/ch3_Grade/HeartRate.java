package ch3_Grade;

// Formula for calculating your maximum heart rate in beats per minute is 220 minus your 
// age in years. Your target heart rate is a range that�s 50�85% of your maximum heart rate. 
// [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates 
// may vary based on the health, fitness and gender of the individual. Always consult a 
// physician or qualified health care professional before beginning or modifying an exercise 
// program.] Create a class called HeartRates. The class attributes should include the person�s 
// first name, last name and date of birth (consisting of separate attributes for the month, 
// day and year of birth). Your class should have a constructor that receives this data as 
// parameters. For each attribute provide set and get methods. The class also should include
// a method that calculates and returns the person�sage(in years),a method that calculates and
// returns the person�s maximum heart rate and a method that calculates and returns the person�s 
// target heart rate. Write a Java application that prompts for the person�s information, 
// instantiates an object of class HeartRates and prints the information from that object 
// including the person�s first name, last name and date of birth then calculates and prints 
// the person�s age in (years), maximum heart rate and target-heart-rate range.

import java.util.Calendar;

public class HeartRate {
	// Fields Here:
//	private String firstN;
//	private String lastN;
//	private int day;
//	private int month;
	private int year;
	private int age;
	private double maxTrag;
	private double minTrag;
	private int maxRate;
	
	// Constructor
	public HeartRate (/*String first, String last, int bDay, int bMonth,*/ int bYear ){
//		firstN = first;
//		lastN = last;
//		day = bDay;
//		month = bMonth;
		year = bYear;
	}
	
	int curentYear = Calendar.getInstance().get(Calendar.YEAR);

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		age = curentYear - year;
	}

	public void setMaxRate() {
		this.maxRate = 220 - age ;
	}
	
	public int getMaxRate() {
		return maxRate;
	}
	
	public double getMaxTrag() {
		return maxTrag;
	}

	public void setMaxTrag() {
		maxTrag = getMaxRate() * 0.8 ;
	}

	public double getMinTrag() {
		return minTrag;
	}

	public void setMinTrag() {
		minTrag = getMaxRate() * 0.5 ;
	}

	
	
//	public String getFirstN() {
//	return firstN;
//}
//
//public void setFirstN(String firstN) {
//	this.firstN = firstN;
//}
//
//public String getLastN() {
//	return lastN;
//}
//
//public void setLastN(String lastN) {
//	this.lastN = lastN;
//}
//
//	public int getDay() {
//	return day;
//}
//
//public void setDay(int day) {
//	this.day = day;
//}
//
//public int getMonth() {
//	return month;
//}
//
//public void setMonth(int month) {
//	this.month = month;
//}

//	public void printInfo (){
//		System.out.printf("%s %s, Birth date: %s/%s/%s, Age: %s \n Maximum Heart Rate: %s, Target heart rate Range is : %s",
//				);
//	}	
}
