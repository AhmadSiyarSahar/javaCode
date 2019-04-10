package com.class14;

public class Dog {
	
	// Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific 
	// attributes and behaviours.
		
	String breed, color;
	boolean tail; 
	int age, legs, eyes; 
	
	// 1 lets define its attributes
	
	public static void main(String[] args) {
		
	Dog dog1=new Dog();
	dog1.breed="Husky";
	dog1.color="White";
	dog1.tail=true;
	dog1.age=5; 
	dog1.legs=4; 
	dog1.eyes=2;
	
	// after writing the new method bellow here we are defining the actions 
	dog1.run();
	dog1.eat();
	dog1.sleep();
	
	System.out.println(".............................Second obj/dog...........................");
	
	Dog dog2=new Dog();
	dog2.breed="Bulldog";
	dog2.color="Black";
	dog2.tail=true; 
	dog2.legs=4; 
	dog2.eyes=2; 
	
	dog2.run();
	dog2.eat();
	dog2.sleep();
	dog2.walk();
	
	System.out.println("............. third obj/dog..............................................");
	
	Dog dog3=new Dog(); 
	dog3.breed="Labrador";
	dog3.color="Grey";
	dog3.tail=true; 
	dog3.legs=4; 
	dog3.eyes=2; 
	
	dog3.run();
	dog3.eat();
	dog3.sleep();
	
}
	void run () {
		System.out.println(breed+ " Dog can run fast.");
	}
	
	void eat() {
		System.out.println(breed+" Dog can eat meat.");
	}
	
	void sleep() {
		System.out.println(breed+" Dog can't sleep during the day.");
	}
	
	void walk() {
		System.out.println(breed+" can even walk.");
	}
	
	
	}