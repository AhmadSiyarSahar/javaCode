package com.class04;

//import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {

		// 4.2
//		
//	String name="Chen";
//	Scanner inp=new Scanner (System.in);
//	 System.out.println("Please enter the name");
//	    name=inp.nextLine();
//  	System.out.println("Please enter the next name");
//	  	name=inp.nextLine();
//	  	if (name=="Chen") {
//		System.out.println ("teacher");
//		  	} else {
//		  	  System.out.println ("student");
//	}
//		  	
//		  	//4.3
//		  	int num=6;
//		  	if (num>0) {
//		  		System.out.println("The num is positive");
//		  	} else {
//		  		System.out.println("The num is negative");
//		  	}
//		  	
//		  	
//		  	//4.4
//		  	
//		  	int age=18;
//		  	System.out.println("Please enter your age");
//		  	age=inp.nextInt();
//		 
//			if (age>=18) {
//				System.out.println("You are elligible to vote");
//				} else { 
//					System.out.println("You are not eglible to vote");
//				}

		int myNum = 5;
		if (myNum > 0) {
			System.out.println("Yes. it it larger");// if two conditions are true, JAVA runs the first condition
		} else if (myNum > 1) { // and shows in console the result of that. it does not go
			System.out.println("Yes it rigth"); // to the next condition.
		} else {
			System.out.println("No, it is wrong");
		}

//		int myNum1=5;
//		if (myNum1>2) {
//			System.out.println("Yes 5 is bigger than 2.");
//		} else if (myNum1>4) {
//			System.out.println("Yes 5 is bigger than 4.");
//		} else {
//			System.out.println("You don't know Java.");
//		}

	}

}
