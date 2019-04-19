package com.class22;

public class PaymentTest {

	public static void main(String[] args) {
		
		Payment parent = new Payment ();
		parent.makePayment();
		
		MasterCard mc= new MasterCard();
		mc.makePayment();
		
		VisaCard vc=new VisaCard(); 
		vc.makePayment();
		vc.annualFee();
		
		
		// achieving run time polymorphism
		// pay --- reference var, 
		// new MasterCard (); Creating an obj of the child class.
		Payment pay=new MasterCard();// any method that exists in parent and it also exists in child class, wilb be printed. if 
		pay.ClosePayment();
		pay.makePayment();
		
		
		Payment pay1=new VisaCard ();
		pay1.ClosePayment();
		pay1.makePayment();
		// pay1.annualFee(); is not accessable because it is not common in child class. 
		

	}

}
