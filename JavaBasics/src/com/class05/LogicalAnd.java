package com.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// ask user to enter age and based on the age, we will print:
		// if age is older than 1 and less than 3 --> baby
		// if age is older than 3 and less than 5-->toddler
		// if age is older than 5 and less than 13--> kid
		// if age is older than 13 and less than 20--->teenager
		// if age is older than 20 and less than 64--->adult
		// if age is older or equal to 64---> senior

		Scanner myScanner;
		int age;
		myScanner = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = myScanner.nextInt();
		if (age >= 1 && age < 3) {
			System.out.println("you are a baby.");
		} else if (age >= 3 && age < 5) {
			System.out.println("you are a toddler.");
		} else if (age >= 5 && age < 13) {
			System.out.println("you are a kid");
		} else if (age >= 13 && age < 20) {
			System.out.println("you are a teenager.");
		} else if (age >= 20 && age < 64) {
			System.out.println("you are an adult");
		} else {
			System.out.println("you are a senior");
		}

		// logical operator ||
		// we have 7 days in a week
		// if days are from 1-5 ---> weekdays
		// if days are from 6-7---->weekend
		// otherwise "Not a valid day"

		int day = 5;
		// false or false or false or false or true ---->true
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("it is a week day");
		} else if (day == 6 || day == 7) {
			System.out.println("it is weekend");
		} else {
			System.out.println("Not valid day");
		}
	}

}
