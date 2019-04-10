package com.class05;

import java.util.Scanner;

public class Scannerr {

	public static void main(String[] args) {
		// not operator
		boolean Human = true;
		if (!Human) {
			System.out.println("right");
		} else {
			System.out.println("wrong");

		}
		// and operator
		int num = 6;
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println(num + " is completely divisible by 2 and 3.");
		} else {
			System.out.println(num + " is not completely divisible by 2 and 3.");
		}
		// or operator
		int num1 = 6;
		if (num1 % 2 == 0 || num1 % 3 == 0) {
			System.out.println(num1 + " is completely divisible by 2 or 3.");
		} else {
			System.out.println(num1 + " is not completely divisible by 2 or 3.");
		}
	}

}
