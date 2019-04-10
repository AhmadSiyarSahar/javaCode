package com.class08;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
	// Ask user to pay for soda keep asking user to pay for soda until the entered
	// price is not equal to 1.99 after user got a right price amount,
	//print "Please enjoy your soda"
		
	Scanner scan;
	double price; 
	scan=new Scanner (System.in);
	do {
		System.out.println("Please pay for soda");
		price=scan.nextDouble();
	} while (price!=1.99);
	System.out.println("Please enjoy your soda");
	
	//For loop
	//First initialize the variable then assign the value
	//provide the condition 
	//then increment or decrement 
			//initialize	condition/testCondition			increment
	for (int i=0;    		 i<=5;     						 i++) {
		System.out.println("Good morning "+i);
	}	
		
	}

}
