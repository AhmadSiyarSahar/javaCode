package com.class03;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
//		int month=12;
//		if (month==1) {
//			System.out.println("Jan");
//		} else if (month==2) {
//			System.out.println("Feb");
//		} else if (month==3) {
//			System.out.println("March");	
//		} else if (month==4) {
//			System.out.println("Apr");
//		} else if (month==5) {
//			System.out.println("May");
//		} else if (month==6) {
//			System.out.println("June");
//		} else if (month==7) {
//			System.out.println("July");
//		} else if (month==8){ 
//			System.out.println("Aug");
//		} else if (month==9) {
//			System.out.println("Sept");
//		} else if (month==10) {
//			System.out.println("Oct");
//		} else if (month==11) {
//			System.out.println("Nov");
//		} else if (month==12) {
//			System.out.println("Dec my birth day month");
//		} else {
//			System.out.println("I do not know what are you talking");
//		}

		Scanner oneNumber = new Scanner(System.in);
		System.out.println("Please enter a number");
		int month = oneNumber.nextInt();
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid");
		}

	}
}
