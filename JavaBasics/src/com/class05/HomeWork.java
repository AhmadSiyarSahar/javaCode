package com.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		// Write a program to find largest of three double values using
        //if-else-...if provided by a user(numbers must be distinct)

		double num1,num2,num3;
		Scanner largestNumber=new Scanner(System.in);
	    System.out.println("Please enter the first number.");
	    num1=largestNumber.nextDouble();
	    
	    System.out.println("Please enter the second number.");
	    num2=largestNumber.nextDouble();
	    
	    System.out.println("Please enter the third number.");
	    num3=largestNumber.nextDouble();
	    
	    if(num1>num2 && num1>num3) {
	        System.out.println(num1+ " is the largest number.");
	    }else if(num2>num1 && num2>num3) {
	        System.out.println(num2+ " is the largest number.");
	    }else if (num3>num2 && num3>num1) //or else {System.out.println("num3 is the largest.")}
	        System.out.println(num3+ " is the largest number is.");
	    
	    
	    
	    // Write a program to find largest number amongst three numbers using
        //nested if provided by a user(numbers must be distinct) 
	    //Possibilities:
	    // 1-  a>b & a>c 
	    // 2-  b>a & b>c
	    //3-   c>a & c>b
	    
	    int a,b,c;
	    Scanner Jan=new Scanner(System.in);
	    System.out.println("Please enter the first number.");
	    a=Jan.nextInt();
	    
	    System.out.println("Please enter the second number.");
	    b=Jan.nextInt();
	    
	    System.out.println("Please enter the third number.");
	    c=Jan.nextInt();
	    
	    if(a >= b) {
			
	  	  if(a >= c)
	  		/* This will only execute if conditions given in both
	  		 * the if blocks are true, which means a is greater
	  		 * than b and c
	  		 */
	  		System.out.println(a +" is the largest Number.");
	  	  else
	  	        /* This will only execute if the condition in outer if
	  		 * is true and condition in inner if is false. which
	  		 * means a is grater than b but less than c.
	  		 * which means c is the largest
	  		 */
	  		System.out.println(c+" is the largest Number.");
	        } 
	        else {
	  			
	  	  if(b > c)
	  		/* This will execute if the condition in outer if is false
	  		 * and inner if is true which means c is greater than a
	  		 * but b is greater than c. That means b is largest
	  		 */
	  		System.out.println(b+" is the largest Number.");
	  	  else
	  		/* This will execute if the condition in outer if is false
	  		 * and inner if is false which means c is greater than a
	  		 * and b. That means c is largest
	  		 */
	  		System.out.println(c+" is the largest Number");
	        }
	  
	    
	    }
	    
	    }

	
	


