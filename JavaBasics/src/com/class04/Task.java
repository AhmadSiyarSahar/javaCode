package com.class04;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		int loan = 300000;
		if (loan < 200000) {
			System.out.println("You can get the loan");
		} else {
			System.out.println("I am sorry");
		}

		int age = 17;
		if (age >= 18) {
			System.out.println("You can have your license");

		} else {
			System.out.println("You can have a permit");
		}

		Scanner client = new Scanner(System.in);
		System.out.println("How much do you want");
		System.out.println("You can get a loan");
		System.out.println(client);

//	int num1, num2;
//	Scanner scan=new Scanner (System.in);
//	System.out.println("Please enter first number");
//	num1=scan.nextInt();
//	System.out.println("Please enter second number");
//	System.out.println(num1);
//	num2=scan.nextInt();
//	System.out.println(num2);
	}
}
