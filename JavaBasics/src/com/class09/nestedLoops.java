package com.class09;

public class nestedLoops {

	public static void main(String[] args) {
		
		for (int a=0; a<5; a++) { ///This is the outer loop and tells how many times the inner loop should be executed only if the condition of the outer loop is true.  
			
			for (int y=0; y<5; y++) {/// This is the inner loop that is executed as many times as the outer loop holds the condition. 
				System.out.println("I am inner loop " +y);// This is the code of inner loop. 
			}
			
			
			System.out.println("  I am outer loop  " +a);// This is the code of outer loop. 
		}

		// hours of the day 24; Minitues of hour 60:
		
		for (int h=0; h<24; h++) {
			for (int m=0; m<60; m++)
				if (m<10) {
					System.out.println(h+ ": 0");
				} else {
			
			System.out.println(h + ": "+m);
		}
	}
		}
}


