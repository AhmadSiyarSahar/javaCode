package com.class15_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		
		ScannerMethod obj=new ScannerMethod();
		Scanner scan= new Scanner (System.in);

		System.out.println("Please enter a number");
		int a = scan.nextInt();
		int b= scan.nextInt();
		
		obj.sum(a, b);
//		obj.sum(10, 12);
//		obj.sum(20, 30);
	}
	
//	void sum(int a, int b) {// we use parameters. as x and y and we use dont want a return. 
//		System.out.println(a+b);
		
		
		int sum (int a, int b) {// we are asking for a return so, we have to change the data type from void to int. 
		return a+b; 	
		
	}
	


}
