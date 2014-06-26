package ch3_Grade;

import javax.swing.JOptionPane;

// Create a class called Invoice 
// An Invoice should include four pieces of information as instance 
// variables � a part number (type String), a part description (type String),
// a quantity of the item being purchased(type int)and a price per item(double).
// Your class should have a constructor that initializes the four instance
// variables. Provide a set and a get method for each instance variable.
// In addition, provide a method named getInvoiceAmount that calculates the
// invoice amount (i.e., multiplies the quantity by the price per item),
// then returns the amount as a double value. 
// If the quantity is not positive, it should be set to 0. 
// If the price per item is not positive, it should be set to 0.0. 
// Write a test application named InvoiceTest that demonstrates class 
// Invoice�s capabilities. 

public class Invoice {

	// Fields here:
	private String partNumber;
	private String partDescription;
	private int purchased;
	private double price;
	private double invoiceAmount;

	// double invoiceAmount;

	public Invoice(String pNumber, String pDescription, int quantity,
			double cost) { // Constructor initializing the local variables
		partNumber = pNumber;
		partDescription = pDescription;
		purchased = quantity;
		price = cost;
	}

	// partNumber methods:
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	// partDescription methods:
	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	// purchased Methods:
	public int getPurchased() {
		return purchased;
	}

	public void setPurchased(int purchased) {
		this.purchased = purchased;
		if (purchased < 0) {
			purchased = 0;
		}
	}

	// price methods:
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		if (price < 0) {
			price = 0.0;
		}
	}

	// TODO i have no idea what i'm doing here!
	//double invoiceAmount = price * purchased;

	public void setInvoice() {
		invoiceAmount = price * purchased;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	// Should return the Invoice amount calculations - USE GET METHOD HERE!
	public void printInvoice() {
//		System.out.printf("Invoice is : %s", getInvoiceAmount());
		JOptionPane.showMessageDialog(null, getInvoiceAmount());
	}

}
