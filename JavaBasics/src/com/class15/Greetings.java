package com.class15;

public class Greetings {

	public static void main(String[] args) { // any method is executable if it is called inside the main method. 
		
			
			Greetings obj=new Greetings();
			obj.askHowAreYou("Omer");// at the time of calling the method it is called argument. 
		}
		
		void askHowAreYou(String name) {
			System.out.println("How are you "+name); // at the time of writing method we call is parameter. 
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


