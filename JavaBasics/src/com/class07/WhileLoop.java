package com.class07;

public class WhileLoop {
	public static void main(String[] args) {
		// To eliminate repetition we use loops.
		// Types of Loops:
		// 1 while
		// do while
		// for
		// enhanced for loops (for each loop) // collections or arrays

		int a = 0;

		while (a < 10) {
			System.out.println("Good morning");
			a++;
		}
//       
		int b = 1;
		while (b <= 5) {
			System.out.println("I am inside while loop " + b);
			b++;
		}
		System.out.println("I am outside of while loop");

		// I want to print values from 10 to 20 inclusive;
//       
//       int z=10;
//       while (z<=20) {
//           System.out.println(z);
//           z++;
//       }
//       //I want to print values from 1 to 20 inclusive but all in 1 line with space;
//       int q=1;
//       
//       while (q<=20) {
//           System.out.print(q+" ");
//           q++;
//       }
//       System.out.println("-----------------------");
//       //I want to print values from 10 to 1;
//       
//       int e=10;
//       
//       while(e>=1) {
//           System.out.println(e);
//           e--;
//       }
//       int x=10;
//       while (x<=40) {
//    	   System.out.println(x);
//    	   x+=5;
//       }
//       // print only odd number from 1 to 20
		int num = 1;
		while (num <= 20) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
			num++; /// it must be outside the if condition.
		}
		// print only odd number from 10 to 100

//       int h=10;
//       while (h<=100) {
//    	   if (h%2!=0) {
//    		System.out.println(h);
//    	   }
//    	   h++; 
//       }

		boolean workDay = true;
		int day = 1;
		while (workDay) {
			System.out.println("I need a day off");
			if (day == 4) {
				System.out.println("I dont need a day off");
				workDay = false;
			}
			day++;
		}

	}
}
