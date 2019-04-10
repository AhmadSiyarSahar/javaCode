package com.class10;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
public class ProcessingArraysElements {

	public static void main(String[] args) {
		// A. summing
		
		// 1. using Stream 
		 int[] a = {10,20,30,40,50};
		int sum = IntStream.of(a).sum();// Formula for adding integers, then we have to import IntStram.
		System.out.println("The sum of a is " + sum);
		 
		// 2. using for LOOP. 
		int[] b = {10,20,30,40,50};
		int total=0; 
		for (int i=0; i<b.length; i++) {
		total+= b[i];	
		}
		System.out.println("The sum of b is "+total);
		

		 int []c= {5, 10, 15, 20, 25, 30}; 
		 int sum1=IntStream.of(c).sum(); 
		 System.out.println("The sum is equall to "+sum1);
		 
		 // To add decimal numbers, we use Double. 
		 double []d= {1.3, 2.4, 5.5, 6.7}; 
		 double sum2=DoubleStream.of(d).sum();// we have to import DoubleStream. 
		 System.out.println("The of decimal numbers is " +sum2);
		 
		 
		 // 3. second way using for loop 
		 
		 int z[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 int sum3 = 0;
		 for (int i : z)
		     sum3 += i;
		 System.out.println(sum3);
		 
		 int arr[]= {144, 46, 0, 86, 292, -1};
		 int sum9=0;
		 for (int findSum:arr) {
			 sum9+=findSum; 
			 System.out.println("The sum9 is "+sum9);
		 }
		 
		 int []e= {10, 20, 30, 40, 50}; 
		 int total1=0; 
		 for (int i : e )
			 total1+=i; 
		 System.out.println(total1);
		 
		 double []r= {1.3, 3.4, 4.6, 5.6};
		 double total2=0; 
		 for (double i:r)
			 total2+=i; 
		 System.out.println(total2);
		 
		 int []s= {1, 2, 3, 4, 5,0}; 
		 int sum5=0; 
		 for (int p:s)
			 sum5+=p; 
		 System.out.println(sum5);
		 
		 double[] t= {1.0, 2.0, 3.0, 4.0, 5.0};
		 double sum6=0.0; 
		 for (double i:t)
			 sum6+=i;
		 System.out.println(sum6);
		 
		 // Find Max number in array. 
		 
		 double[] myList = {1.9, 2.9, 3.4, 3.5};
		 double max = myList[0];
		 for (int i = 1; i < myList.length; i++) {
		 if (myList[i] > max) 
			 max = myList[i];
		 }
		 System.out.println("Max is " + max);
		 
		 int []p= {1, 2, 3, 4, 5, 7, 9, 44, 0};
		 int maxi=p[0]; 
		 for (int i=0; i<p.length; i++) {
			if (p[i]>maxi)
				maxi=p[i];
		 }
		 System.out.println("Max is "+maxi);
		 
		 // finding the minimum number
		 double[]y= {1.2, 2.3, 3.4, 4.5};
		 double min=y[0];
		 for (int i=0; i<y.length; i++) {
			 if (y[i]<min) 
				 min=y[i];
		 } System.out.println("The min number is "+min);
	}

}
