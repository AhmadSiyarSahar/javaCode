package com.class05;

import java.util.Scanner;

public class nestIfCondition {

	public static void main(String[] args) {
		// if user has a credit card-->
		// check the balance if balance is more than 1000--?payoff
		// else "You are good."

		boolean creditCard = true;
		int balance = 1000;
		if (creditCard) {
			System.out.println("Lets check the balance");
			if (balance >= 1000) {
				System.out.println("pay off now");
			} else {
				System.out.println("you are ok");
			}
		} else {
			System.out.println("Do you want to apply for credite card");
		}

		Scanner userName = new Scanner(System.in);
		System.out.println("Enter your name");
		String myName = userName.nextLine();
		System.out.println("Enter your age");
		int myAge = userName.nextInt();
		System.out.println("Enter your mobile number ");
		String myPhone = userName.nextLine();

		System.out
				.println("Your name is " + myName + ", your age is " + myAge + " and your mobile number is " + myPhone);
	}

}
