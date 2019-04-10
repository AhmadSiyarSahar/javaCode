package com.class04;

import java.util.Scanner;

public class ScannerNote {

	public static void main(String[] args) {
		// shortcut: write main+ctrl+space+enter it will bring the auto main method.
		// ask user for the name and print Good Morning

		// How to use Scanner
		// 1- import the scanner in java before the main class at top by writing import
		// java.util.scanner;
		// 2- Make a scanner variable by writing Scanner give it a name assign it the
		// value. such as:
		// Scanner Ahmad=new Scanner (System.in); / new Scanner (System.in) is the
		// assigned value which remains
		// the same always.
		// 3- print out your massage that you want to ask the user by writing
		// System.out.println ("massage to ask the user ");
		// 4- print out your input by writing System.out.println (write the name of
		// your Scanner variable.nextLine()); such as
		// System.out.println(Ahmad.nextLine()); if the data type of
		// our variable is String, we write nextLine. If it is a number, we should write
		// nextInt and if its
		// double, we should write nextDouble.
		// 5- if we want to see our input to be printed in console, then:
		// System.out.println(" our statement " + name of variable)
		Scanner Ahmad = new Scanner(System.in);
		System.out.println("Please enter any name");
		System.out.println(Ahmad.nextLine());
		System.out.println("The name you entered is " + Ahmad);

	}

}
