package com.class13;

import java.util.Scanner;

public class IntervQuesCont {

	public static void main(String[] args) {


		// write a java prog to check whether a given number is prime or not?
		
		
				// prime number has two conditions:
				// 1- it should be divisible by number 1 and byitself only. such as 2, 3, 5, 7, 9, 11, 13, 17, 19, 23, 29
				
				int number; 
				Scanner input=new Scanner (System.in);
				System.out.println("Please enter a number to check if it is a prime number");
				number=input.nextInt();
				boolean prime=true; 
				
				for (int i=2; i<number; i++) {
					
				if (number%i!=0) {
				} else {
					prime=false;
					break; 
				}
				System.out.println(prime);
	}

				// write a java prog to print the first 10 numbers of Fibonacci series. 
				
				int a=1; 
				int b=0; 
				int c=0; 
				
				for (int i=0; i<10; i++) {
					c=a+b; 
					a=b; 
					b=c; 
					System.out.print(a+" ");
				}
}
}