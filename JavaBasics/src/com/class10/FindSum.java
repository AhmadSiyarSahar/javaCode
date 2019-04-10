package com.class10;

public class FindSum {

	public static void main(String[] args) {

		int z[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// find largest, second largest, min,

		int largest = 0;
		int sLargest = 0;
		int min = 0;
		

		for (int y : z) {
			if (y > largest) {
				largest = y;
			}
			if (y < min) {
				min = y;
			}
			if (y > sLargest && y < largest) {
				sLargest = y;
			}
		}
		System.out.println("The max is " + largest);
		System.out.println("The min is " + min);
		System.out.println("The secmax is " + sLargest);

	}
}
