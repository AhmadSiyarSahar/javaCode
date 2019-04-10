package com.class13;

public class StringManipulation {

	public static void main(String[] args) {
	
		// toCharArray()  it converts a string to array of characters. 
		
		
		String str="Saturday";
		char[] array=str.toCharArray();
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		for (char c:array) {
			System.out.println(c);
		}
		
		
		System.out.println("printing in reverse");
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
		
	}

}
