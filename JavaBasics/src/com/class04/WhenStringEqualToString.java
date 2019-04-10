package com.class04;

import java.util.Scanner;

public class WhenStringEqualToString {

	public static void main(String[] args) {

		String weather = "sunny";
		String weather1 = "Hot";

		if (weather.equals("Sunny")) { // when a string is equal to a string we write it as written.
			System.out.println("I will go walking");
		} else if (weather1.equals("Hot")) {
			System.out.println("I will go walking");
		} else {
			System.out.println("I will stay home.");
		}
	}
}
