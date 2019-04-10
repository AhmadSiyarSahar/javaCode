package com.class03;

public class Modulus {
	public static void main(String[] args) {
		// . The modulus operator (%) returns the remainder of a division operation. It
		// only tells us what is the reminders of a division operation.
		int a = 10;
		int b = 3;
		int div = a / b;
		System.out.println(div); // The answer it shows in console, will be 3.
		int modulusReminder = a % b; // The formula for showing reminder.
		System.out.println(modulusReminder);

		int x = 37;
		int y = 7;
		int modRem = x % y;
		System.out.println(modRem);

		// modulus operator
		int mod = a % b;
		System.out.println(mod); // 1

		int q = 101;
		int w = 10;
		System.out.println(q % w);

	}

}
