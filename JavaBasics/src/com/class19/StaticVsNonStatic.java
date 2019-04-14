package com.class19;

public class StaticVsNonStatic {
	
	public String name="John";// \This will be acceesable to entire project. so it is instance var
	
	public static String lastName="Snow"; // it is static var
	
	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.getInfo();
		
		obj.getinfo1();// within same class we can call it by using method/var name.
		
	}
	// non static mehtod can access to both instances and static var
	public void getInfo () {// it is non static method we want to create a method to be accesable to all project class. therefore, we out it out side the main class. 
		
		System.out.println("My name is "+name + " and my last name is "+lastName);
		// obj.getinfo1(); we can access 
	}
	
	public static void getinfo1 () { // Static method can have access only to static var. since name is a non static var it will complain. 
		// System.out.println("My name is "+name + " and my last name is "+lastName);
	}

}
