package com.class11;

import java.util.Scanner;

//import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {

//		int[][] a1 = {
//				{ 5, 2, 3, 7 }, /// TO add one row from a 2D arrays 
//				{ 1, 5, 2, 2 },
//				{ 1, 2, 3, 4 }
//				};
//		int rowTot = 0;
//		for (int i = 0; i<=a1.length; i++) { ///
//			rowTot += a1[2][i];
//		}
//		System.out.println(rowTot);
//		
//		String ex="HI!";
//		String ac="HI !";
//		ac=ex.trim();
//		System.out.println(ex.equals(ac));
//		
//		 //Write a java program that prints out true if ( x * y ) return a positive value. Else prints out false if  (x * y) return a negative value.
//
//	    //Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number"-for the 2nd number
//
//	    //Step 2: Create the if condition to check the X and Y value validation for the sign value
//
//	    //Step 3: If it is positive value user would get True if it negative value user would get false
//		
//		
//			int x, y;
//	        Scanner scan=new Scanner (System.in);
//	        System.out.println("Please first number");
//	        x=scan.nextInt();
//	        System.out.println("Please ennter second number");
//	        y=scan.nextInt();
//	        if (x*y>0) {
//	            System.out.println("true");
//	        }else {
//	            System.out.println("false");
//	        }
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		  int[] result =new int[a.length];
	     int sum=0;

	      for (int i=0; i<a.length; i++){
	   sum=0;
	      for (int j=0; j<a[i].length; j++){
	     sum = sum+a[i][j];
	     result[i]=sum;
	      }
	      System.out.println(sum);
	     
	    		  
			  }
	      int n=2; 
	      int m=4; 
	      int u=5;
	      int h=1;
	      if (!(m>u) && (n>u) || (h>u) ) {
	    	  System.out.println("hi we can use && and || at the same time");
	      }
		}
	}

