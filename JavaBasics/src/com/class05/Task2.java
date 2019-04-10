package com.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// ask user to enter price and boolean value for sale
		// based on the sale we will check the price
		// if price< 20 ---> apply 20 % discount and give final price
		// if price <20 and <100-->apply 30% discount and give final price.
		// if the price is >100 and less than 500--> apply 50% discount and give final
		// price.

		Scanner userName = new Scanner(System.in);
		System.out.println("Enter your name");
		String myName = userName.nextLine();
		System.out.println("Enter your mobile number ");
		String myPhone = userName.nextLine();
		System.out.println("Enter your age");
		int myAge = userName.nextInt();
		System.out
				.println("Your name is " + myName + ", your age is " + myAge + " and your mobile number is " + myPhone);

		// In scanner, if we have string and int to use, we have to use the string first
		// and later the int. because if we use int first, and once we press enter, it
		// will
		// accept as string.

	}
}
