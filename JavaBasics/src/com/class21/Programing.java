package com.class21;

public class Programing {

	/*
	 * 1- Create a class named ‘Programming’. While creating an object of the class,
	 * if nothing is passed to it, then the message “I love programming languages”
	 * should be printed. If some String is passed to it, then in place of
	 * “programming languages” the value variable should be printed. Example, if we
	 * pass “Java”, then “I love Java” should be printed.
	 */

	Programing() {
		System.out.println("I love programming languages");
	}
	Programing (String str){
		System.out.println("I love "+str);
	}
	
	public static void main(String[] args) {
		Programing obj=new Programing();
		Programing obj1=new Programing("Java");
	}
	
	 /* 2. Create 1 class with a static method that has 3 overloaded forms. Then call
	 * each overloaded method with specific arguments and observe result.
	 * 
	 * 3. Create 1 class with a private method that has 3 overloaded forms. Then
	 * call each overloaded method with specific arguments and observe result. (edited)
	 */
	
	
	private void question2(){
		System.out.println("I am private method with no parameters");
	}

	private void question2(String str){
		System.out.println("I am private method with one parameters");
	}

	void question2(String str1, String str2){
		System.out.println("I am default method");
	}

}

