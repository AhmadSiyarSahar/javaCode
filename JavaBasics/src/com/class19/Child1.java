package com.class19;

public class Child1 extends Parents {
	String hairType = "curly";

	public static void main(String[] args) {

		Child1 childObject = new Child1();
		System.out.println("Child 1 eye color " + childObject.eyeColor);
		System.out.println("Child 1 hair color " + childObject.hairColor);
		System.out.println("Child 1 has " + childObject.nose + " nose");
		childObject.sing();
		childObject.playTennis();
	
		Parents parentObject = new Parents();
		// parentObject.hairType --> not accessible in Parent Class
		// parentObject.playTennis()--> not accessible in Parent Class

	}

	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}
	public void canDance( ) {
		System.out.println("child 1 can dance");
	}
}