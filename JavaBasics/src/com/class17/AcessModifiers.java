package com.class17;

public class AcessModifiers {

	
		
		/*Create a method that will take 1 parameter as a String and return reversed String. 
		 * Method should be visibly only within same package.
		 
		 * Create a method that will take a String and return whether String is palindrome or not. 
		 * Method should available to all classes within your projects.
		 
		 * Create a method that will take a string and return array of words from that string. Method should be 
		 * available only within same class.
		 */
		
		protected String reversedString (String str) {
	
		for (int i=str.length()-1; i>=0; i--) {
			String reversed="";
			reversed=reversed+str.charAt(i); 
			
		}
		return reversed; 
	}

}
