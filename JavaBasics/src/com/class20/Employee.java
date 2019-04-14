package com.class20;

public class Employee {
	
	
	 public static String department="IT";
	 protected long salary1; 
	 int salary;
	
	public void getPaid() {
		System.out.println("Employee Get paid"+ salary1);
	}
	
	public static void work () {
		System.out.println("Employees work in "+ department+ "dept");
	}
	
	// private static void work () {
	//	System.out.println("Employees work in "+ department+ "dept");
	// Private members (var and methods) dont get inherited from any class. 

	protected static void test () {
		System.out.println("I am a protected method");
	}
	
	void test1 () {
		System.out.println("I AM A DEFAULT MEHTOD");
	}
}
