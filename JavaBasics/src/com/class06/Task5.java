package com.class06;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
	
		Scanner scan;
        char grade; 
        String rate;
		scan=new Scanner(System.in);
	    System.out.println("Please enter your grade");
	    grade=scan.next().charAt(0);
	        
	        switch (grade) {
	        
	        case 'A':
	         rate="Excellent";
	            break;
	        case 'B':
	        	rate="Good";
	            break;
	        case 'C':
	        	rate="Average";
	            break;
	        case 'D':
	        	rate="Bad";
	            break;
	        default:
	        	rate="Not Acceptable";

	}
	       System.out.println("Your grade is "+rate);

	}
}
