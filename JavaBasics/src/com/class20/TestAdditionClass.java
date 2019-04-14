package com.class20;

public class TestAdditionClass {
	
	public static void main(String[] args) {
		Addition obj = new Addition ();
		obj.add(10.2, 12.2); // it will go the addition class and will add the parameters of (double a, double b)
		obj.add(100);
		obj.add(100, 100.10);
		obj.add(10.10, 10);
	}

}
