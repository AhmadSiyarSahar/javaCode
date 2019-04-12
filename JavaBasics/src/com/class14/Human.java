package com.class14;

public class Human {

	String name, education, country; 
	int age; 
	
	
	void eat() {
		System.out.println("Human being has to eat in order to survive.");
	}
	void sleep() {
		
		System.out.println("Human being must sleep");

		}
	void see() {
		System.out.println("All human being cant see.");
	}
	
	
	public static void main(String[] args) {
		
		Human man=new Human();
//		Human woman=new Human();
//		Human boy=new Human();
//		Human girl=new Human();
		
		man.eat(); 
		man.see();
		man.sleep();
		man.age=33; 
		
		
		
	}

}
