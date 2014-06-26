package ch04_test;

import javax.swing.JOptionPane;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		int iAccountNumber, 
		iBeginBalance, 
		iTotalCharged, 
		iCredits, 
		iCreditLimit,
		quit = 0;
		
		JOptionPane.showMessageDialog
		(null, "This Application will calculate \nwhether any of several department-store customers\nhas exceeded the credit limit on a charge account.", "Welcome!", 
				JOptionPane.INFORMATION_MESSAGE);
		
		while (quit != 1){
			String sAccountNumber = JOptionPane.showInputDialog("Please Enter the Account Numner:", JOptionPane.OK_OPTION);
				if (sAccountNumber .equals("quit")){
					quit = 1;
					JOptionPane.showMessageDialog(null, "Good By!");
				} else {
					iAccountNumber = Integer.parseInt(sAccountNumber);
						String sBeginBalance = JOptionPane.showInputDialog("Plese enter the balance at the beginning of the month:");  
					iBeginBalance = Integer.parseInt(sBeginBalance);
						String sTotalCharged = JOptionPane.showInputDialog("Plese enter the total of all items charged by the customer this month:");  
					iTotalCharged = Integer.parseInt(sTotalCharged); 
						String sCredit = JOptionPane.showInputDialog("Plese enter the total of all credits applied to the customerís account this month:");  
					iCredits = Integer.parseInt(sCredit); 
						String sCreditLimit = JOptionPane.showInputDialog("Plese enter the allowed credit limit:");  
					iCreditLimit = Integer.parseInt(sCreditLimit); 
					
					CreditProcess myCredit = new CreditProcess(iAccountNumber, iBeginBalance, iTotalCharged, iCredits, iCreditLimit);
						myCredit.printAll();
						myCredit.newBalance();
						myCredit.limitExceded();
					
				}
		}

	}

}
