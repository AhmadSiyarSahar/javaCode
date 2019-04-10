package com.class04;

public class NestedIfStatement {

	public static void main(String[] args) {
		double gpa = 3.6;
		double expectedGpa = 3.9;
		Boolean hasDiploma = true;

		if (hasDiploma) {
			System.out.println("Cong");
			if (gpa > expectedGpa) {
				System.out.println("You are hired");
			} else {
				System.out.println("We cant hire you");
			}

		} else {
			System.out.println("get your degree");
		}

	}

}
