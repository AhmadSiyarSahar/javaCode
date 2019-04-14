package com.class20;

public class Task {
	/* create one class in which create a methods that will calculate the area of 
	 * rectangle
	 * square
	 * cube
	 * use separate class to test your code 
	 */
	
	public void getArea (int a) { 
		System.out.println("The area of square is =" +(a*a));
		
	}
	
	public void getArea (double a, int b, int c) { 
		System.out.println("The area of rectangular is =" +(a*b*c));
	}
	
	public void getArea (int a, double b) { 
		System.out.println("The area of cub is =" +(a*b));
		//     return a*b; compiler gives an error cause return cant be used with overloading
	}
	
	public void getArea (double a, double b) { 
		System.out.println("The area of cub is =" +(a*b));
	}


}
