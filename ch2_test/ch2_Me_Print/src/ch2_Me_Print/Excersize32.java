package ch2_Me_Print;
// Write a program that inputs five numbers and determines and prints the 
// number of negative numbers input,the number of positive numbers input 
// and the number of zeros input. 
import java.util.Scanner;

public class Excersize32 {
 public static void main (String [] args){
	 Scanner in = new Scanner (System.in);
	 
	 int nn1, nn2, nn3, nn4, nn5;
	 
	 System.out.print("Enter first number: ");	
	 int n1 = in.nextInt();
	 System.out.print("Enter second number: ");	
	 int n2 = in.nextInt();
	 System.out.print("Enter third number: ");	
	 int n3 = in.nextInt();
	 System.out.print("Enter fourth number: ");	
	 int n4 = in.nextInt();
	 System.out.print("Enter fifth number: ");	
	 int n5 = in.nextInt();
	 
	 
	 if (n1 < 0 ){
		nn1 = 1;
	 } else {
		 nn1 = 0;
	 }
	 if (n2 < 0 ){
			nn2 = 1;
		 } else {
			 nn2 = 0;
		 }
	 if (n3 < 0 ){
			nn3 = 1;
		 } else {
			 nn3 = 0;
		 }
	 if (n4 < 0 ){
			nn4 = 1;
		 } else {
			 nn4 = 0;
		 }
	 if (n5 < 0 ){
			nn5 = 1;
		 } else {
			 nn5 = 0;
		 }
	 
	 int neg = nn1 + nn2 + nn3 + nn4 + nn5;
	 int pos = 5 - neg;
	 System.out.printf("There is %d negative and %d positive numbers!", neg, pos);
 }
}
