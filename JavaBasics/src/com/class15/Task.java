package com.class15;

public class Task {

	public static void main(String[] args) {

//  create a method that will take 2 parameters as a numbers and prints which number is larger. 
		
		 Task obj = new Task();
		    obj.isLarger(-100,100);
		    
		    }
		    
		    void isLarger(int a, int b) {
		        if (a>b) {
		            System.out.println("number "+a+" is larger than number "+b);
		            
		        } else {
		            System.out.println("Number "+b+" is larger than "+a);
		        }
		    }
		    
		    
	/// create a method that will take a number and prints whether teh number is even or odd. 
		    
		    void number(int a) {
		        if(a%2==0)System.out.println(a+" is even");
		        else System.out.println(a+" is odd");
		    }
		    
		    }

		

// Create 


