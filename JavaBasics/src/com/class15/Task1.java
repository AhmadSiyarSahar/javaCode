package com.class15;

public class Task1 {

	public static void main(String[] args) {
		
		Task1 num = new Task1();
		num.findLargestNumber(102, 12);
		num.findEven(13, 2);
		num.sumOf(12, 12);
		

	}
	
	public void findLargestNumber(int a, int b) {
		if (a>b) {
			System.out.println("A is larger");
		}else {
			System.out.println("b is larger.");
		}
	}

	public void findEven(int a, int b) {
		if (a%2==0 & b%2==0) {
			System.out.println("the number is even");
		}else {
			System.out.println("The number is odd");
		}
	
		}
	protected void sumOf(int a, int b) {
		System.out.println("The sum of a+b is "+ a+b);
	}
	
}
