package com.class15_2;

public class Task {
	

	public static void main(String[] args) {
		
		Task demo2 = new Task ();
		demo2.millage();
	}

	void millage() {
		for (int a = 0; a <=9; a++) {// loop a controls loop b.
			for (int b = 0; b <= 9; b++) { // loop b controls c.
				for (int c = 0; c <= 9; c++) {// loop c controls loop d. 
					for (int d = 0; d <= 9; d++) {

						System.out.println(a + "" + b + "" + c + "" + d);
					}
				}
			}

		}

	}
}
