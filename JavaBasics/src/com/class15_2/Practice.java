package com.class15_2;

public class Practice {
	public static void main(String[] args) {

		Practice demo1 = new Practice();
		demo1.myClass();

	}

	void myClass() {
		for (int i = 1; i <= 4; i++) {

			for (int y = 1; y <= 6; y++) {

				if (i == 1 || i == 4 || y == 1 || y == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}
}
