package ch3_Grade;

import javax.swing.JOptionPane;

public class EmployeeDriver {
	public static void main (String [] args){
	
		String name1_1 = JOptionPane.showInputDialog("Plese enter the First Name of the first employee");
		String name2_1 = JOptionPane.showInputDialog("Plese enter the Last Name of the first employee");
		
		
		String mSalStr_1 = JOptionPane.showInputDialog("Plese enter the monthly Salary of the first employee");
		double mSal_1 = Double.parseDouble(mSalStr_1);
		
		String name1_2 = JOptionPane.showInputDialog("Plese enter the First Name of the second employee");
		String name2_2 = JOptionPane.showInputDialog("Plese enter the Last Name of the second employee");
		
		
		String mSalStr_2 = JOptionPane.showInputDialog("Plese enter the monthly Salary of the second employee");
		double mSal_2 = Double.parseDouble(mSalStr_2);
		
		
		Employee employee1 = new Employee(name1_1, name2_1, mSal_1);
		Employee emplpyee2 = new Employee(name1_2, name2_2, mSal_2);
		
		employee1.setySalary();
		employee1.setUpSalary();
		
		emplpyee2.setySalary();
		emplpyee2.setUpSalary();
		
		
		employee1.printResults();
		emplpyee2.printResults();
		
		
	}
}
