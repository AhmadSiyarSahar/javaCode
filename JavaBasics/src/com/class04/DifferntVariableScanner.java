package com.class04;

import java.util.Scanner; //shortcut to import Ctrl+shift+o

public class DifferntVariableScanner {

	public static void main(String[] args) {

		// User enters a text.
		Scanner Afg = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = Afg.nextLine(); // we create our variable as string and then, nextLine()
		System.out.println("You entered " + name);

		// user enters a number
		Scanner Afg1 = new Scanner(System.in);
		System.out.println("Please enter your age");
		int myAge = Afg1.nextInt(); // we create our variable as int because the user has entered a number.
									// then,nextInt();
		System.out.println("You entered your age as " + myAge);

		// Usre enters a decmial number
		Scanner Afg2 = new Scanner(System.in);
		System.out.println("Please enter the price");
		double newPrice = Afg2.nextDouble();// we create our variable as double, because the user has entered a decimal
											// number, then, multiply it by nextDouble.
		System.out.println("You entered the new price as " + newPrice);

		// user enters true or false
		Scanner Afg3 = new Scanner(System.in);
		System.out.println("Please enter true or false");
		boolean trueOrFalse = Afg3.hasNextBoolean();// we create boolean variable.
		System.out.println("You entered " + trueOrFalse);
	}

}
