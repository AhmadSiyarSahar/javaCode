package com.class01;

public class Quiz {
	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			// I want to print pattern
			// 12345
			// 12345
			// 12345
			// 12345

			for (int a = 1; i < 5; i++) {
				for (int b = 1; b < 6; b++) {
					System.out.print(b);
				}
				System.out.println();
			}
		}

		/*
		 * I want to print pattern 1111111 --> rows=7, columns=7 2222222 3333333 4444444
		 * 5555555 6666666 7777777
		 */

		for (int i = 1; i <= 7; i++) {

			for (int y = 1; y <= 7; y++) {
				System.out.print(i);// 1111111 //2222222
			}
			System.out.println();
		} 
		
		// I want to print pattern:
		//*****
		//*****
		//*****
		//*****
		
		for (int v=0; v<4; v++) {
			for (int w=0; w<5; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// I want to print pattern:
				//54321
				//54321	
				//54321
		   		//54321
				
		for (int x=5; x>=1; x++) {
			for (int y=0; y<5; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		// I want to print pattern
		// *
		// **
		// ***
		// ****
		 for (int n=0; n<4; n++) {
			 for (int m=0; m<=n; m++)
			 if (n==1); 
			 System.out.print("*");
		 }
		 System.out.println();
		
	}

}
