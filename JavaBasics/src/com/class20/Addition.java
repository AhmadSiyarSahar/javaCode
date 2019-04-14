package com.class20;

public class Addition {

	public void add(int a, int b) { // 1- overloading method,
		System.out.println(a + b);
	}

	public void add(int a) {
		System.out.println(a + 100); // overloading method by changing the number of arguments/parameters
	}

	public void add(int a, int b, int c) { // overloading method by changing the number of arguments/parameters
		System.out.println(a + b + c);
		// our method behaives different in all those three methods.
	}

	public void add(double a, double b) { // 2- over loading method by changing the data type of the parameter.
		System.out.println(a + b);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}
	
	public void add(double a, int b) {
		System.out.println(a + b);
	}

	public void add(double a, double b, double c) {
		System.out.println(a + b + c);
	}
}
