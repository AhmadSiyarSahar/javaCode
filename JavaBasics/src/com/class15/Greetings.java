package com.class15;

public class Greetings {

	public static void main(String[] args) { // any method is executable if it is called inside the main method. if 
		// we call it out side the main method, it can be only read able not executable. 

			Greetings obj=new Greetings();
			obj.askHowAreYou3("Siyar");// at the time of calling the method it is called argument. 
		}
		
		void askHowAreYou(String name) { // it is a method holding one String parameter. 
			System.out.println("How are you "+name); // at the time of writing method we call it as parameter. 
		}
		
		void askHowAreYou1(String name) {// void is a return type. and askHowAreYou is the name of the method.
			System.out.println("How are you "+name);
		}
		void askHowAreYou2(String name) {
			System.out.println("How are you "+name);
		}
		void askHowAreYou3(String name) {
			System.out.println("How are you "+name);
		}	
	}


