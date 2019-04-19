package com.class14;

public class ReturnTypeMethod {

	public static void main(String args[]) {// main method inside which there are blocks of codes. 

		ReturnTypeMethod obj = new ReturnTypeMethod();//  creating the obj for the method named add. 
		int x = obj.add();// inializing x and assigning to it the value of a+b
		System.out.println(x);
		
		
//		ReturnTypeMethod obj1 = new ReturnTypeMethod();
//		String y=obj1.name(); 
//		System.out.println(y);
//		
	}
	
		public int add() {// declaring the var inside the method, so no need to have parameters.  
		int a = 4;
		int b = -4;
		int c = a + b;
		return c; // Telling java to return me the finding of a+b. 
	}
//		public String name () {
//			String name="Siyar";
//			String lastName="Sahar";
//			return ; 
//		}

}
