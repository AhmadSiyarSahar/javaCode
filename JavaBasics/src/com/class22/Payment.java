package com.class22;

public class Payment {
	public void makePayment() {// overridden method
		System.out.println("we cant make a payment with no fee");
	}
	
	public void ClosePayment () {
		System.out.println("All payments needs to be closed");
	}

}

class MasterCard extends Payment { // overridding method 
	public void makePayment() {
		System.out.println("we cant make a payment with 2 % fee");

	}
}

class VisaCard extends Payment { // overridding method 
	public void makePayment() {
		System.out.println("we cant make a payment with 1.5 % fee");

	}
	public void annualFee () {
		System.out.println("Visa Card has an annual fee ");
	}
}

