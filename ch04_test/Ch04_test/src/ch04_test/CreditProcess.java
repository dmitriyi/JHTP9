package ch04_test;

public class CreditProcess {
	private int iAccountNumber,
		iBeginBalance, 
		iTotalCarged, 
		iCredits, 
		iCreditLimit,
		newBalance;
	public CreditProcess (int AccountNumber, int balanceBegin, int totalCharged, int credits, int creditLimit){
		iAccountNumber = AccountNumber;
		iBeginBalance = balanceBegin;
		iTotalCarged = totalCharged;
		iCredits = credits;
		iCreditLimit = creditLimit;
	}
	public int getiAccountNumber() {
		return iAccountNumber;
	}
	public void setiAccountNumber(int iAccountNumber) {
		this.iAccountNumber = iAccountNumber;
	}
	public int getiBeginBalance() {
		return iBeginBalance;
	}
	public void setiBeginBalance(int iBeginBalance) {
		this.iBeginBalance = iBeginBalance;
	}
	public int getiTotalCarged() {
		return iTotalCarged;
	}
	public void setiTotalCarged(int iTotalCarged) {
		this.iTotalCarged = iTotalCarged;
	}
	public int getiCredits() {
		return iCredits;
	}
	public void setiCredits(int iCredits) {
		this.iCredits = iCredits;
	}
	public int getiCreditLimit() {
		return iCreditLimit;
	}
	public void setiCreditLimit(int iCreditLimit) {
		this.iCreditLimit = iCreditLimit;
	}
	
	public void printAll () {
		System.out.printf("Account Number: %s\n", getiAccountNumber());
		System.out.printf("Balance at the beginning of the month is:%s\n", getiBeginBalance());
		System.out.printf("Total of all items charged by the customer this month:%s\n", getiTotalCarged()); 
		System.out.printf("Total of all credits applied to the customer’s account this month: %s\n", getiCredits());
		System.out.printf("Allowed credit limit for this account: %s\n", getiCreditLimit());
	}
	
	public void newBalance(){
		newBalance = getiBeginBalance() + getiTotalCarged() - getiCredits();
		System.out.printf("New balance is: %s\n", newBalance);
		
	}
	
	public void limitExceded() {
		if (newBalance >= getiCreditLimit())
			System.out.print("Credit limit exceeded");
			
	}
	
}
