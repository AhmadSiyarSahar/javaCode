package com.class13;

import java.util.Scanner;

public class IntervQuestions {

	public static void main(String[] args) {
		
		// write a program to swap 2 numbers without a temporary variable ? 
		
		int a=10; 
		int b=20; 
		
		a=a+b; //a==>30 first we perform the operation 
		b=a-b; // 30-20=10 we find what is b which means we assign a new variable to b
		a=a-b; // 30-10=20 
		System.out.println("The value of a= "+a+" value of b="+b);
		
		int x=100; 
		int y=200; 
		 x=x+y; 
		 y=x-y; 
		 System.out.println("The new value of x is= "+x +" and the new value of y is= "+y);
		//swap 2 strings without a temporary variable. 
		
		 int k=20; 
		 int o=10; 
		 k=k+o; 
		 o=k-o; 
		 System.out.println(o);
		 
		String str1="Hello";
		String str2="World";
		
		str1=str1+str2; /// HelloWorld
		str2=str1.substring(0, str1.length()-str2.length()); //Hello
		str1=str1.substring(str2.length());
		
		System.out.println("The value of str1 is "+str1+" and the value of str2 is "+str2);
		
		// Write a a java prog to find out the second largest number in the array,
		// the maximum and minimum number in the array and its sum?
		
		int arr[]= {144, 46, 0, 86, 292, -1};
		int min=arr[0];
		int secondLargest=arr[0];
		int largest=arr[0];
		int sum=arr[0];
		
		for (int a1:arr) {
			if (a1>largest){
				largest=a1;
			} if (a1<min) {
				min=a1;
				if (a1>secondLargest && a1<largest) {
					secondLargest=a1; 			
			}
		}		
	}
		for (int a1:arr)
		sum+=a1;
		System.out.println("second largest is "+secondLargest);
		System.out.println("the mini number is"+ min);
		System.out.println("the largest number is "+largest);
		System.out.println("the sum is "+sum);
		
//		// write a java program to reverse string? reverse a string word by word?
//		
//		String sentence="The master is speaking.";
//		String reverse =""; 
//		for (int i=sentence.length()-1; i>=0; i--) {
//			reverse=reverse+sentence.charAt(i);
//		}
//		 String [] words=reverse.split("");
//		 for (int i=words.length-1; i>=0; i--) {
//			 System.out.print(words [i]+"");
//		 }
		

		
		// write a java prog to find whether a string is palindrome or not?
		// (dad, mom, madam)
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter any word to check if it is a palideome");
		String word= scan.nextLine();
		String reverse="";
		for (int i=word.length()-1; i>=0; i--) {
			reverse +=word.charAt(i);
		}
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidrome");
		}else {
			System.out.println("The word is not palidrome");
		}
		
		
	}

}
