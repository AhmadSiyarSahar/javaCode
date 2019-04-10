package com.class07;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {

		int rollNumber;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		rollNumber = scan.nextInt();
		String StudentName = null;
		switch (rollNumber) {
		case 101:
			StudentName = "Ramesh";
			break;
		case 102:
			String Studentname = "Mahesh";
			break;
		case 103:
			StudentName = "Mukesh";
			break;
		default: {
			StudentName = "Not found Student name: in Class";
		}
			
		}
		System.out.println(StudentName);
	}

}
