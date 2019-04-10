package com.class04;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		// take a number from a user and print that number.

		@SuppressWarnings("resource")
		
		Scanner takeNumber1 = new Scanner(System.in); // Once we write Scanner and give it a name then, ctrl+shift+o
														// will
		System.out.println("Please enter a number"); // automatically import java.util.Scanner.
		int myNumber = takeNumber1.nextInt();
		System.out.println("The number you endered is " + myNumber);

		System.out.println("Pleaes wirte your age");
		int myAge = takeNumber1.nextInt();
		System.out.println("You are " + myAge + " years old.");

	}

}
