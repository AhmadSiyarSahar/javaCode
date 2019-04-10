package com.class10;

public class PracticeAllArrays {

	public static void main(String[] args) {
		// Find the highest, second highest, lowest,  second lowest and sume of a 2D array. 
		
		/*
		 * Find highest and lowest number in 2D Array
		 * sum of specific numbers.
		 */
		
		int [][] twoD = { {2,1,3,4} , {10,20,30,40,-2,50} , {100,250,450,500}, {800} };
	
		int max = twoD[2][3];	
		int min = twoD[0][0];
		int SecondLargest = 0;
		int SecondMin = twoD[0][0];
		
		
		/*
		 * You can not assign zero(0) to your variables while you are trying to find minimum and second minimum.
		 * Because if you assign zero, system will return to you 0 as minimum. 
		 * Instead we write twoD[0][0];
		 */
		
		/*
		 * If you want to find max and min numbers in 2 dimensional array, first you need to check all numbers.
		 * So you have to convert 2D array to numbers
		 * After that you need to write conditions.
		 * If number is greater than max we need to assign that number to our max variable.
		 * When we are finding min. 2nd condition:
		 * if number is less than min. you need to assign this number to our min. variable. 
		 * 
		 */
		
		for (int[] oneD : twoD) {
			for(int Number : oneD) {
				if (max < Number) {
					max = Number;
				}
				if (min > Number) {
					min = Number;
				}
			}
		}
		
		
		for (int[] oneD : twoD) {
			for(int Number : oneD) {
				if (SecondLargest < Number && Number < max) {
					SecondLargest = Number;
				}
				if (SecondMin > Number && Number > min) {
					SecondMin = Number;
			}
		}
		System.out.println("The highest number in this array is "+max+" and the lowest number in this array is "+min);
		System.out.println("The second largest number in this array is "+SecondLargest);
		System.out.println("The second lowest number in this array is "+SecondMin);
		
		System.out.println("-----------------------------------------");
		
		/*
		 * first We declare one variable 
		 * second we need to check entire numbers
		 * then we should add all numbers one by one to our variable.
		 * We need to print our result out of the loop to see exact sum.
		 * If you write it in the loop you can see every step.
		 */
		int sum = 0;
		for (int[] oneDi : twoD) {
			for(int Number : oneDi) {
				sum += Number; 
			
			}
				
			}
		System.out.println("Sum: "+sum );
				
			}	
		
	}

}
