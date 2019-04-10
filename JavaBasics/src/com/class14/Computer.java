package com.class14;

public class Computer {

	String OS, brand="";
	boolean mouse, keyboard;
	int screen, ram;

	public static void main(String[] args) {

		// Create an obj for computer:

		Computer comp1 = new Computer(); // we are creating obj and define its attributes this is the first step.
		comp1.mouse = true;
		comp1.keyboard = true;
		comp1.OS = "Windows";
		comp1.screen = 13;
		comp1.ram = 16;
		comp1.brand = "HP";

		// lets do the second step by defining its behavior or action

		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();

		System.out.println("..../////////////////second obj.............");
		// create the second obj
		
		Computer comp2 = new Computer();

		comp2.mouse = true;
		comp2.keyboard = true;
		comp2.OS = "Mac";
		comp2.screen = 10;
		comp2.ram = 12;
		comp2.brand = "Apple";

		comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playMusic();
	}

	void watchMovie() {
		System.out.println("We can watch movie " + brand);
	}

	void doJavaCoding() {
		System.out.println("We can do coding " + brand);
	}

	void playMusic() {
		System.out.println("We can paly music " + brand);
	}
}
