package com.class20;

public class TestTask {

	public static void main(String[] args) {
	
		Task obj =new Task();
		obj.getArea(5); // it prints the square
		obj.getArea(5.5, 5, 5);// it prints the rect
		obj.getArea(5, 5);
		obj.getArea(5.5, 5.5);

	}

}
