package com.class14;

public class Main1 {
	
	String name;
	int rollNo;
	

	public static void main(String[] args) {
		
		Main1 John=new Main1();
		John.name="John";
		John.rollNo=2; 
		
		John.name();
		John.rollNo();
	}
	
	void name () {
		System.out.println("Name is John and ");
	}
	void rollNo () {
		System.out.println("roll number is 2");
	}

}
