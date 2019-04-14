package com.class17;

public class TestAccessModifiers {

private char[] name1;
private char[] name2;
private char[] name3;

public static void main(String[] args) {
		
		TestAccessModifiers obj=new TestAccessModifiers();
		obj.isPalindrome("madam");//accessing public method within same package
		obj.reverseString("hello");//accessing protected method within same package
		obj.sayHello();//accessing default method within same package
		//obj.getWordsFromString("Hello Students"); private method is not accessible
		
		System.out.println(obj.name1);//accessing default variable within same package
		System.out.println(obj.name2);//accessing protected variable within same package
		System.out.println(obj.name3);//accessing public variable within same package
	}

void sayHello() {
	
	
}

String reverseString(String string) {
	return string;
	
	
}

boolean isPalindrome(String string) {
	return false;
	
}

public String[] getWordsFromString(String string) {
	
	return null;
}
}