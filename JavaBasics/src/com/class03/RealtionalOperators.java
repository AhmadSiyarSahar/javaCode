package com.class03;

public class RealtionalOperators {

	public static void main(String[] args) {

		int a = 19;
		int b = 5;
		boolean result = a > b;// We use boolean because it only says true or false.
		System.out.println(result);
		int c = 10;
		int d = 10;
		boolean result1 = c == d;
		System.out.println(result1);

//	compare 2 numbers and if a is larger than b ....> print

		if (a > b) {
			System.out.println("a is larger than b");
		} else {
			System.out.println("b is larger than a");
		}

		if (c != d) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}

		// declare price and if price is higher than expected price ...I will not buy
		// it.
		double shoesPrice = 29.99;
		double allLowedPrice = 31.99;
		if (shoesPrice <= allLowedPrice) {
			System.out.println("I am buying the shoes");
		} else {
			System.out.println("I am not boying the shoes");
		}
		System.out.println("I am continoues code"); // The program just reads from top to bottom and left to right.
		System.out.println("I am continoues code");
		System.out.println("I am continoues code");
	}
}
