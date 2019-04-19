package com.class22;

public class SyntaxStudent extends Student {
	public void study() {
		System.out.println("Syntax Students must study hard");

	}

	protected void doHomeWork() {
		System.out.println(" Syntax Students must do rpl home work");
	}

	void attendClasses() {
		System.out.println("Syntax Students must attend all java classes");
	}

	private void doResearch() {// private mehtods cant be overridden cause it can be only accessed within the same class
		System.out.println("Syntax Students must make friends");
	}
}
