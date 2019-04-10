package com.class03;

public class IfStatements {

	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 14;
		if (num1 > num2) {
			System.out.println("num1 is larger than num2");
		} else {
			System.out.println("num1 is smaller than num2");
		}
		System.out.println("I can do it");// it can be print in console. As much statements we have in program, it
		// will be printed in console once we run the program.
		// In if statements:
		// step 1- start with if step2- we give condition inside the parenthesis
		// (num1>num2) we give the condition in
		// the manner which is true. step3- {System.out.println ("we write our
		// sentence") } Step4- we write else
		// step 5 {System.out.println("we write our statement")}

		int boy = 18;
		int girl = 16;
		if (boy >= 18) {
			System.out.println("You can marry.");
		} else {
			System.out.println("You can not mary");
		}
		if (girl < 16) {
			System.out.println("You can not mary");
		} else {
			System.out.println("You can mary");
		}

		int num = 23;
		int num3 = 23;
		if (num > num3) {
			System.out.println("num1 is larger than num2");
		} else if (num1 == num2) {
			System.out.println("num1 is equall to num2");
		} else {
			System.out.println("num1 is smaller than num2");
		}

		// MultipleConditions
		// In case of multiple conditions: step 1- We use if step 2- (give our
		// condition) step 3-{System.out.println ("our statement")}
		// step 4- else if (we give our next condition){System.out.println ("our
		// statement")} else if (we give our next condition)
		// {System.out.println ("our statement")} it can continue as much condition as
		// we give, Remember: at the end of all conditions,
		// then, we write else {System.out.println ("our statement")} to say to java if
		// none of the all conditions is true, then what to
		// to show in console.

		int day = 8;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("I do not know what are you talking");
		}
	}

}
