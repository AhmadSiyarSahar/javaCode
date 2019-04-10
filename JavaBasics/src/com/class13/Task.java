package com.class13;

public class Task {

	public static void main(String[] args) {
		
	// Create a string that will hold a sentence then, write a program to get a new string without any spaces. 
		
		String str="Today is the Java day.";
		String a=str.replaceAll(" ", "");
		System.out.println(a);
		
	// create a string that should be combination of letters, numbers and special characters. Then, find out how many
	// alpha chracters are there in the string. 
		
		String str1="How are 324&*#$$ 0409 you.";
		String b=str1.replaceAll("[^A-Za-z]", "");
			System.out.println(b.length());
			
			
	// You have a string a1="Is it Saturday? Is it raining? Do we have a java class today? How would you find out howmany 
	// sentences are there in that string. 
			
			
			String a1="Is it Saturday? Is it raining? Do we have a java class today?";
			String []array=a1.split("\\?");// in ? we have to use the \\ back slashes. 
			System.out.println("The number of sentences are " + array.length);
		

	}

}
