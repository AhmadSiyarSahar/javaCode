package com.class14;

public class Car {

	String make, model, color; // we declare the variables of the object here and we specify its type whether 
	int door, wheels; 			// it is String, int, boolean...
	
	public static void main(String[] args) { // We define all our codes that are executable in main method. 
		
		
		// specify className variableName=new ClasName(); =====>The formula:
		
		// First Obj
		
		// 1- we define the obj specification or its attributes here. 
		
		Car car1=new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Balck";
		car1.door=4; 
		car1.wheels=4; 
		// car Honda has 4 wheels
		
		
		// 2- we Define the behaviour or action of the obj here.
		
		car1.drive(); // This is called method which is ended by ();
		car1.reverse();
		car1.stop();
		
		System.out.println("Car "+car1.make+ " has "+car1.wheels+ " wheels");
		
		// My car is blue Tesela ====> it will not run here. cause Java reads from top to bottom. Blue
		// Tesela is defined bellow. 
		
		// second obj 
		
		System.out.println(" ////////// Second Ojb/////////////////////");
		
		// 1- we define the second's obj specifications here. 
		
		Car car2=new Car(); // This is the formulla for obj. 
		
		car2.make="Tesla";
		car2.model="x"; 
		car2.color="Blue";
		car2.door=4;
		car2.wheels=4; 
		
		
		// 2- we define the second's obj behavior or actions here. 
		
		car2.drive();
		car2.reverse();
		car2.stop();
		
		// My car is blue Tesela
		
		System.out.println("My car is "+ car2.color+ " "+ car2.make);
		
	}
	
	// we can make the new methods inside the same class but out side the main method. they can't be in same main method. 
	
	void drive() {
		System.out.println("Car can drive");
	}
	void reverse () {
		System.out.println("Car can reverse");
	}
	void stop() {
		System.out.println("Car can stop");
	}

}
