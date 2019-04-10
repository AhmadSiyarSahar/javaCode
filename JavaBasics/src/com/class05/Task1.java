package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// write a java program to ask user to enter daily sales amount
		// based on the sales range commission will be different
		// sales <100 -->2
		// sales more than 100 and less than 200-->5
		Scanner scan;
		int sales;
		int commission;
		scan = new Scanner(System.in);
		System.out.println("Please enter slaes amount");
		sales = scan.nextInt();
		if (sales > 0 && sales < 100) {
			commission = 2;
		} else if (sales >= 100 && sales < 200) {
			commission = 5;
		} else if (sales > 200 && sales < 500) {
			commission = 10;
		} else if (sales >= 500) {
			commission = 20;
		} else {
			commission = 0;
		}
		System.out.println("your commission is " + commission);
	}

}
