package com.class09;

import java.util.Scanner;

public class Task3 {

	private static final int Scanner = 0;

	public static void main(String[] args) {
		// 1. Write a program that reads a set of integers, provided 
		//by a user and then prints the sum of the even and odd integers.
		// 2. Ask user to enter the item they want to buy and  the price for
		// the item. Then ask user to pay for it. Every time user enters
		// money accumulate the amount and tell user how much is left to pay off 
		//the amount. Whenever user done with payments tell them "Thank you for 
		//shopping!"
		
		
	
		
		int sumEven=0; 
		int sumOdd=0; 
		Scanner scan= new Scanner (System.in); 
		System.out.println("Please enter the first number and end number");
		int sR; int eR; 
		sR=scan.nextInt(); 
		eR=scan.nextInt();
		for (int a=sR; a<=eR; a++) {
			if (a%2==0) {
				sumEven+=a;
			}else {
				sumOdd+=a;
			}
			
		}
		System.out.println("The sum of even "+sumEven+ "sum of odd "+sumOdd);
		
	}

}
