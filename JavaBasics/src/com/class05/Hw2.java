package com.class05;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		 // Write a program to find largest number amongst three numbers using
        //nested if provided by a user(numbers must be distinct) 
	    
	    int a,b,c;
	    Scanner Jan=new Scanner(System.in);
	    System.out.println("Please enter the first number.");
	    a=Jan.nextInt();
	    
	    System.out.println("Please enter the second number.");
	    b=Jan.nextInt();
	    
	    System.out.println("Please enter the third number.");
	    c=Jan.nextInt();
	    
	    if(a > b) {
			
	  	  if(a > c)
	  		System.out.println(a +" is the largest Number.");//largest=a;-->instead of printing. 
	  	  else
	  		System.out.println(c+" is the largest Number."); //largest=c;-->instead of printing.
        } 
        else {
  			
  	  if(b >c)
  		System.out.println(b+" is the largest Number.");//largest=b;---> instead of printing.
  	  else
  		System.out.println(c+" is the largest Number");//largest=c;--->instead of printing.
        }
	    
	    
    }


	}


