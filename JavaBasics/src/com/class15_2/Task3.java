package com.class15_2;

import java.util.Scanner;

public class Task3 {


	public static void main(String[] args) {

		
	Task3 demo4= new Task3();
	demo4.findSum();
	
	}
	
	
	void findSum() {
		int sumEven=0; 
		int sumOdd=0; 
		Scanner scan= new Scanner (System.in); 
		System.out.println("Please enter the first number and end number");
		int sR; int eR; 
		sR=scan.nextInt(); 
		eR=scan.nextInt();
		for (int a=sR; a<=eR; a++) {
			if (a%2==0) {
				sumEven+=a;
			}else {
				sumOdd+=a;
			}
			
		}
		System.out.println("The sum of even "+sumEven+ "sum of odd "+sumOdd);
		
	}

}
