package ch3_Grade;

import javax.swing.JOptionPane;

public class Addition_Prompt {

	public static void main (String[] args){
		
//		int
//		number2,
//		number3,
//		sum;
		
		String in1 =JOptionPane.showInputDialog("Please Enter First Number: ");
		double number1 = Double.parseDouble(in1);
		
		String in2 =JOptionPane.showInputDialog("Please Enter First Number: ");
		double number2 = Double.parseDouble(in2);
				
		double sum = number1 + number2;
				
		JOptionPane.showMessageDialog(null, sum);
		
		
//		System.out.print("Enter First Integer: ");
//		number1 = input.nextInt();
//			
//		System.out.print("Enter second Integer: ");
//		number2 = input.nextInt();
//		
//		System.out.print("Enter third Integer: ");
//		number3 = input.nextInt();
//		
//		if (number3 == 0) {
//			System.out.print("Cannot devide by 0");
//		}
//		if (number3 != 0){
//		sum = (number1 + number2) / number3;
//		
//		System.out.printf("Result of (A+B)/C is: %d\n", sum);
//		}
		// this calculator is buggy - inputing non Int will result in crash
		// "input" variable is never killed causing a memory leak!
	}
}
