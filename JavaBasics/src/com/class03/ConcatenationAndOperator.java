package com.class03;

public class ConcatenationAndOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		String a = "Hello";
		String b = "Bye";
		// Java executes from left to right. When we are adding numbers, the sing (+) plays
		// arethmetic role which means it adds the numbers. but when are use it between
		// two strings it just concatenates those two statements.
		//in a String + String the (+) concatenates 
		//in a String + number the (+) concatenates.
		//in a number + number the (+) adds two numbers. 
		System.out.println(x + y + a + b); // 30HelloBye // it operates as x+y=30, then concatenates the two strings. which are a and b. 
		System.out.println(x + a + y + b); // 10Hello20Bye
		System.out.println(x + a + b + y); // 10HelloBye20
		System.out.println(a + b + x + y); // HelloBye1020  The first thing java does, is that it 
		//concatenates two strings as a concatenates b= HelloBye then, concatenates HelloBye with x 
		//which is 10, then concatenates HelloBye10 with y which is 20. Reason why concatenates HelloBye10 with y/
		// Java reads from left to right. it accepts HelloBye10 as a string. 
		System.out.println(a + b + (x + y)); // HelloBye30

		System.out.println(); // short cut syso+Ctrl+space+enter
		// Ctrl+Shift+L it shows all the shortcuts of E-clips.
		// ctrl+shift+ it enlarges the Eclip's page.
		// ctrl- it makes the Eclip's page smaller.

		int a1 = 10;
		int b1 = 3;
		int div = a1 / b1;
		System.out.println(div); // it will show 3. not 3.3 because int does not show decimals.
		// modulus operator shows us only the reminder. 
		int mod = a1 % b1;
		System.out.println(mod);


	}

}
