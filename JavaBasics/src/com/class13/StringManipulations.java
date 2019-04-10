package com.class13;

public class StringManipulations {

	public static void main(String[] args) {
		
		//1. replace()
		
		String str="I am a good tester.";
		String newStr= str.replace("a", "e");
		System.out.println(newStr);
				
		String newStr1=str.replace("good", "best");
		System.out.println(newStr1);
		
		String newStr2=str.replace("tester", "programmer");
		System.out.println(newStr2);
		// uppercase matters. 
		String newStr3=str.replace("Tester", "programmer");
		System.out.println(newStr3);
		String newStr4= str.replace(".", "!");
		System.out.println(newStr4);
		
		
		
		
		// 2 replacedAll() It will replace all that matches specified pattern [regex];
		
		String str1="-12Hello 348#$93 World 395&730";
		String replacedNoNumbers= str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		String newString=replacedNoNumbers.replaceAll("[^A-Za-z]", " ");// it means remove everything except the characters. 
		System.out.println(newString);
		
	
		String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");// 
		System.out.println(replacedNoCharacter);
		
		String str2="1Hello123";
		String newStr5=str2.replaceAll("[^0-9]", "");
		System.out.println(newStr5);
		
		
		
		
		
		
	

	}

}
