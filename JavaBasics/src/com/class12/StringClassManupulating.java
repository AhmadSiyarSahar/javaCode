package com.class12;

public class StringClassManupulating {

	public static void main(String[] args) {
		
		// anything we put inside "" is called string. 
		
		// 1 way to creat a string
		String str="1, 2, 4";
		String str1="Hello";
		String str2="!@#$%%^^&&&";
		
		// 2 way to create a string by using new keyword
		
		String myString=new String ("Hello");
		
		String str3= "Syntax";
		int lengthOfString=str3.length();/// to calculate the number of characters inside the string. 
		System.out.println(lengthOfString);
		
		String str4="Syntax, Technologies"; 
		int legnthOfStr4=str4.length();/// it counts every thing inside the "" such as space, comma...
		System.out.println(legnthOfStr4);
		
		String  str5="Hello";
		String upperCase=str5.toUpperCase(); /// to change character in to upper case. 
		System.out.println(upperCase);
		
		String lowerCase= str5.toLowerCase();/// to change all character in to lower case. 
		System.out.println(lowerCase);
		
		/// to compare two strings we should never use == instead we should use .equal
		// if strings are equal -----> we get in print out true else -----> false
		String str6="Hello";
		String str7="hello";
		boolean equality=str6.equals(str7);
		System.out.println(equality);
		
		
		/// to compare 2 strings but ignores upper case or lower case. 
		
//		String expectedBrowser="chrome";
//		String actualBrowser="CHROME";
//		boolean equal=expectedBrowser.equalsIgnoreCase()
//		
		
		/// To contains in the strings 
		
//		String name="Hello Good Morning, Students!";
//		boolean contain= name.contains("Hello");
//		System.out.println(contains);
//		
		
		String present ="Welcome, Siyar"; 
		String neededValue="Welcome, ";
		System.out.println();
		boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
			
		
		
		/// to check that the string contains with the start character and end character' 
		
		String str8="Syntax";
		boolean starts=str8.startsWith("S");
		System.out.println(starts);
		
		boolean starts1=str8.endsWith("x");
		System.out.println(starts1);
		
		
		
		/// to check the string is empty or not
		// if length of a string is =0 -----> it is empty else not. 
		
		String str9="";
		boolean isEmpty=str9.isEmpty();
		System.out.println(isEmpty);
				
		
		
		String hi="Helo ";
		String hi1="Siyar";
		System.out.println(hi+hi1);
		System.out.println(hi.concat(hi1));
		
		// to remove the spaces at the begging and at the end of the string we use trim();
		
		String expected="Hello Siyar, How are you";
		String actual= "    Hello Siyar, How are you          ";
		actual=actual.trim();
		System.out.println(expected.contentEquals(actual));
	}

}
