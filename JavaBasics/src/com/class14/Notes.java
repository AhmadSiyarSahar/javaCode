package com.class14;

public class Notes {
	
// First step. We declare the object's attributes/features inside the class.or it is also called declaring variables

	public static void main(String[] args) {
		//  Second step. we create the obj of the class and define the attributes/features and any other 
		// executable codes inside the main method. 
		// we can create as much obj of the class as we want here. such as dog1, dog2, dog3, dog....
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.color="White";
		dog1.tail=true;
		dog1.age=5; 
		dog1.legs=4; 
		dog1.eyes=2;
		
		// Fourth step. we define the actions bellow each obj.  

	}

	// Third Step. we create a new method outside the main method but inside the class and define the actions/behaviors
	// How to do so: we write void and give the actions name paranthcess and its body.
	
	 void run() {
		 // body of the new method. 
		 System.out.println("dog can run fast");
	 }
	 
}
