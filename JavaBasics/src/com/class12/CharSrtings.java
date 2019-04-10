package com.class12;

public class CharSrtings {
	public static void main(String[] args) {
		
		String str="Students"; 
		char character=str.charAt(7);
		System.out.println(character);
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+", ");
		}
		/// indexOf() --> returns an index of specified character. 
		
		String str1="Sunday"; 
		int index=str1.indexOf("y");
		System.out.println(index);
		
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));//0
		System.out.println(str2.indexOf("Technologies"));//7
		System.out.println( str2.indexOf(" "));//6
		System.out.println(str2.indexOf("w"));//-1
		
		/// Subsstring()  it gives another string from your current string. 
		
		String str3="Today is Sunday java class";
		String newString=str3.substring(5);
		System.out.println(newString);
		
		System.out.println(str3.substring(0, 5));
		System.out.println(str3.substring(9, 20));
		System.out.println(str3.substring(16, 20));
		
	}

}
