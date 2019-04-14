package com.class19;

public class Task {
	
/*1- Write a program that will have a constructor: one with parameters and second without any parameters. 
 * Create a separate Test class where you will execute both of the constructors.
	 *
	 */

	Task (){
		System.out.println("Constructor with no parameter");	
	}
	
	Task (int a, int b){
		System.out.println("constructor with two int data type parameters");
	}
	
	public static void main(String[] args) {
		Task obj1=new Task(); 
		Task obj2=new Task(2, 4);
		
		 
	}
	
}
