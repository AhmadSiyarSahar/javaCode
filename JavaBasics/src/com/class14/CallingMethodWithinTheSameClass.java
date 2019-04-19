package com.class14;

public class CallingMethodWithinTheSameClass {

	public static void main(String[] args) {
		
	CallingMethodWithinTheSameClass obj = new CallingMethodWithinTheSameClass(); //second step==> create the obj for method named run.
	obj.run(); // Third step==>calling the method with no parameters
	
	CallingMethodWithinTheSameClass obj1 = new CallingMethodWithinTheSameClass();// creating the obj for second method name sum.
	obj1.Sum(2, 6.0);// calling method of two parameters with int and double type
	
	CallingMethodWithinTheSameClass obj2 = new CallingMethodWithinTheSameClass();//creating the obj for third method named name.
	obj2.name( "", "");
	
	CallingMethodWithinTheSameClass obj3= new CallingMethodWithinTheSameClass();// creating the obj for the fourth method named add. 
	obj3.add();
	}
	
	
	

	void run () { // creating the user defined method with no parameters/First step
		System.out.println("I can run fast");
		}
		
		void Sum (int a, double b) { //creating the user defined method of two parameters with int and double type
			System.out.println(a+b);
		}
		void name (String a, String b) {
			String name = "Ahmad Siyar", lastName = "Sahar"; 
			System.out.println("My name is "+name + " and my last name is "+lastName);
		}
		
		void add () {// declaring the local var inside the method with no parameters. This means if we declare 
			int a=10;// our var inside the method, we cant have parameters. in other words, if we have parameters, 
			int b=20; // we can't declare them as var in the method. 
			int c=a+b; 
			System.out.println(c);
		}
		
	}

