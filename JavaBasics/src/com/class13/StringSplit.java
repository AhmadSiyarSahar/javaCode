package com.class13;

public class StringSplit {

	public static void main(String[] args) {
		
		String str="Welcome Syntax Students Batch4.";
		String [] array= str.split(" ");// it gives the length of the words in an array. 
		//String [] array=str.split("Students");// it will split from students and will print out the the next line. 
		System.out.println("The length of the array is "+array.length);
		
		for (String subsring:array) {
			System.out.println(subsring);
		}
	}

}
