package ch3_Grade;


public class Account {	

	private double balance; // Instance Variable that will store the balance
	
		public Account (double initBalance){ // Constructor
		
		if (initBalance > 0.0)
			balance = initBalance; // if balance is less then 0.0 the it will be initiated to 0.0
		}

		public void credit ( double ammount )	{ // Credit (add) an amount to the account
			balance = balance + ammount; // add amount to balance
		}
		
		public void debit (double withdraw){
			if (balance < withdraw ){
				System.out.print("Debit amount exceeded account balance.");
			} else {
			balance = balance - withdraw;
			}
		}
		
		// Return the account balance GET method
		public double getBalance (){
			return balance; // Gives the value of balance to the calling method
		}
}
