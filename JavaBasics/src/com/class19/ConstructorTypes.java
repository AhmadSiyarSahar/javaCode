package com.class19;

public class ConstructorTypes {
	
	
	ConstructorTypes (){// first constructor created 
		System.out.println("I am a constructor with no parameter");
	}
	
	ConstructorTypes (String str){ /// second consturoct is created str is a local var to the constructor 
		System.out.println("I am a constructor with one parameter" +str);
	}
	
	ConstructorTypes(int a, String str){ // third const is created. 
		System.out.println("I am a constructor with TWO parameters"+a+ " and "+str);
	}
	
	public static void main(String[] args) {
		
		ConstructorTypes obj1=new ConstructorTypes();// This will call the first cons with no parama
		ConstructorTypes obj2=new ConstructorTypes("String");// This will call the second cons with one parama
		ConstructorTypes obj3=new ConstructorTypes(123, "String");// This will call the third cons with TWO parameters by order 
		
	}
}
