package com.class02;

import java.util.Scanner;

public class ShortCutsInOerations {

	public static void main(String[] args) {
// short cuts for adding, subtracting and more:
		// 1- Adding/subtracting just only number one to any number:
		// pre-incremental addition: ++variable's name ==> it only adds one to the
		// variable.
		int num = 4;
		++num;
		System.out.println(num);
// or we can do as System.out.println(++num);
		System.out.println(++num);
		System.out.println(num);
		// Post-incremental addition:
		System.out.println(num++);
		// pre-incremental subtraction:
		int num1 = 4;
		--num;
		System.out.println(num1);
		// or we can do as System.out.println(--num);
		// post-incremental subtraction:
		int num2 = 5;
		System.out.println(num--);
		// 2- adding/subtracting or multiplying any number more than one to a number:
		int Ahmad = 4;
		Ahmad = Ahmad + 5; // Here we are adding 5 to Ahmad's value.
		// or
		Ahmad += 5;
		Ahmad = Ahmad - 5;// Here we are subtracting 5 from Ahmad's value.
		Ahmad = Ahmad * 5; // Here we are multiplying Ahmad's value by 5.

		Scanner age = new Scanner(System.in);
		System.out.println("Enter your age");
		int myAge1 = age.nextInt() + 10; // Here we are adding 10 to the myAge value.
		System.out.println("your age after 10 years is " + myAge1);

		Scanner userName = new Scanner(System.in);
		System.out.println("Enter you name");
		String myName = userName.nextLine();
		System.out.println("Enter your age");
		int myAge = userName.nextInt();
		System.out.println("Enter you mobile number ");
		int myPhone = userName.nextInt();
		System.out
				.println("Your name is " + myName + " your age is " + myAge + " and your mobile number is " + myPhone);

		int month = 2;
		switch (month) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
