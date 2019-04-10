package com.class04;

import java.util.Scanner;

public class Practice {

	// Ask user to enter city and temperature in F
	// Your program should convert F--> C
	// Your program should say "The Temperature in city of .... is.....

	public static void main(String[] args) {
		String cityName;
		int temp;
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName = myScanner.nextLine();
		System.out.println("Please enter temperature in F");
		temp = myScanner.nextInt();
		// Forumula
		int convertedTemp = (temp - 32) * 5 / 9;
		System.out.println(convertedTemp);
		System.out.println("The temp in the city of " + cityName + "is" + convertedTemp + "c");

	}

}
