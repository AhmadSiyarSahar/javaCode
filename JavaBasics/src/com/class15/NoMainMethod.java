package com.class15;

public class NoMainMethod { // methods and variables are the members of our class. 
	
	String ste; // it is also called data members. /instance variable (is used inside the class but outside the method. 
	int num;
	// if we dont have a main method, the code will not be executed. it will be only readable.  
	void hello () {
		System.out.println("Hi");
		System.out.println("Hi friends");
		System.out.println("Hi my friend");
	}
	 void bye() {
		 System.out.println("bye");
	 }
	 
	 
	 public static void main(String[] args) { // this is method signature any code inside the method is called method body. 
		
		 NoMainMethod obj=new NoMainMethod(); // Starting from new we create a new obj and we reference it thought obj. 
		 obj.hello();// Through it we get access to our hello method code So, what ever code we have written in hello method, 
		 				//will be executed. This is called calling a method. So, this will print out all those codes such as 
		 				// hi, hi friends, hi my friend that we had written in our hello method. Then, it will 
		 				// go to next method bye that we have created. 
		 obj.bye();
	}
	 
	 
}
