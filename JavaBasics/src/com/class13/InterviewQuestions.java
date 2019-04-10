package com.class13;

public class InterviewQuestions {

	public static void main(String[] args) {
		//
		
		//1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?

		int a, b, temp;
		   a = 10;
		   b = 20;
		   System.out.println("Before swapping : a, b = "+a+", "+ + b);
		   temp = a;
		   a = b;
		   b = temp;   
		  System.out.println("After swapping : a, b = "+a+", "+ + b);
		//2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		  
		  
		  int arr[] = { 1110, 4, 54, 8, 101, 2, 56, 100, 21, 120 };
		  int max=arr[0];
		  int secondMax=arr[0];
		  for (int i=0; i<arr.length; i++) {
			  if (arr[i]>max) {
				  secondMax=max;
				  max=arr[i];
			  }else if (arr[i]>secondMax) {
					  secondMax=arr[i];
				  }
				 
			  }
			  System.out.println("The second largest number is "+secondMax);
			  
			
		  
	// 3. Find out how many alpha characters present in a string?
			  
			  String y="How are you my friend";
			  System.out.println(y.length());
				
	//4.How to find out the part of the string from a string? 
	
			  String m="My name is Ahmad Siyar Sahar.";
			  String n=m.substring(11, 16);
			  System.out.println(n);
			  
	// Find number of words in string?
			  String [] array= m.split(" ");// it gives the length of the words in an array.
			  System.out.println("The length of the array is "+array.length);
			  
	// What is substring? 
			  
			  // substring is the value of a string in a bigger string. 
			  
			  

	//5. Write a java program to reverse String? Reverse a string word by word?
		
			  
			  
		String v=".Today is Java day";
		String reverse="";
		char[] w=v.toCharArray();
		for (int i=w.length-1; i>=0; i--) {
			reverse=reverse+w[i];
	}
		System.out.println("The Reverse String of Today is Java day is "+reverse);

}
}