package com.class20;

public class MainMethodOverLoading {

	public static void main(String[] args) {
		
		System.out.println("I am a main method with String arguement array");

	}
	
		public static void main() {
		
		System.out.println("I am a main method with no parameter");
		}
		
		public static void main(String args) {
			
			System.out.println("I am a main method with String parameter");
			}
		
		public static void main(int a) {
			
			System.out.println("I am a main method with int parameter");
			}



}
