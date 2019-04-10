package com.class09;

public class Practice {
	public static void main(String[] args) {

//		/*
//		 * I want to print pattern 
//		 * 1111111  --> rows=7, columns=7
//		 * 2222222 
//		 * 3333333 
//		 * 4444444
//		 * 5555555 
//		 * 6666666 
//		 * 7777777
//		 */
//		for (int i = 1; i <= 7; i++) {
//			for (int y = 1; y <= 7; y++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		/*
//		 * I want to print pattern 
//		 * ***** rows=4; columns=5;
//		 * *****  
//		 * ***** 
//		 * *****
//		 */
//		for (int a = 1; a <= 4; a++) {
//			for (int b = 1; b <= 5; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		/*
//		 * I want to print pattern 
//		 * 54321 rows=4; columns=5
//		 * 54321 
//		 * 54321 
//		 * 54321
//		 */
//		for (int x=4; x>=1; x--) {
//			for (int y=5; y>=1; y--) {
//				System.out.print(y);
//			}
//			System.out.println();
//		}
//		/*I want to print pattern
//		 * 	55555 rows =5; columns=5; 
//		 *  44444
//		 *  33333
//		 *  22222
//		 *  11111
//		 */
//		for (int r=5; r>=1; r--) {
//			for (int c=5; c>=1; c--) {
//				System.out.print(r);
//			}
//			System.out.println();
//		}
		
		// I want to print the pattern as:
		//	****** rows=4; columns=6; 
		//	*    *
		//	*    *
		//	******
		for (int i = 1; i <= 4; i++) {

			for (int y = 1; y <=6; y++) {

				if (i == 1 || i == 4 || y == 1 || y == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		//Print the following pattern:
		//	1    rows =5; columns= 5
		//	12
		//	123
		//	1234
		//	12345
		
		for (int i=1; i<=5; i++) {
			for (int y=1; y<=i; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
}
