package com.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		// prompt user to enter 2 integers and compare at the end
		// print print largest

//		Scanner myScanner;
//		int num1, num2;
//		int largest = 0;
//		myScanner = new Scanner(System.in);
//		for (int i = 1; i <= 5; i++) {
//		System.out.println("Please enter num1");
//		num1 = myScanner.nextInt();
//
//		System.out.println("Please enter num2");
//		num2 = myScanner.nextInt();
//
//			if (num1 > num2) {
//				largest = num1;
//			} else if (num2 > num1) {
//				largest = num2;
//			} else {
//				System.out.println(num1 + " is equal to " + num2);
//			}
//			System.out.println(largest + " is the largest");
//		}

		for (int m = 2011; m <= 2019; m++) {
			if (m == 2019) {
				break;
			}
			System.out.println("It is year " + m);
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println(i + "Happy New Year!");
		}
	
	}
}