package com.class15;

public class Methods {

	public static void main(String[] args) {
		
//		/// a method cant be created inside another method. it should be out side the method but inside the class. 
//		
////		void hel () {
////		}
//		
//		Methods obj=new Methods();
//		obj.hello();
//		
////		// how to find the largest number 
////		obj.findLargest(0, 0);// 
////		obj.findLargest(10, 20); //calling method findLargest passing values................... 
////		obj.findLargest(30, 31); // calling method findLargest passing values....................  
////		obj.helloToInsutructor("Asel");
////		int a=10; 
////		int b=20; 
////		if (a>b) {
////			System.out.println("A is bigger");
////		} else {
////			System.out.println("B is bigger");
////		}
////		
////		}
////	void hel() {/// Now it is outside the method and inside the class it can be created. 
////	}
////	
////	void hello() {
////		System.out.println("Hello");
////	}
////	void findLargest(int a, int b) {
////		
////	}
////	 void helloToInsutructor() {
////		 System.out.println("Hello "+name);
////	 }
////	

		
		Methods obj =new Methods();
		obj.hello();
		//how to find largest number
		obj.findLargest(20, 10);//calling method FindLargest and passing values as 20&10
		obj.findLargest(30, 31);//calling method FindLargest and passing values as 30&31
		obj.findLargest(2000, 664674);
		obj.helloToInstructor("Weqas");
		obj.helloToInstructor("Arif");
	}
	
	void helloToInstructor(String name) {//name="Awet" Method with 1 parameter
		System.out.println("Hello "+name);
	}

	void hello() { // method signature 
		System.out.println("Hello"); // method body
	}
	void findLargest(int a, int b) { // method with 2 parameters
		
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
	}
	
}
	


