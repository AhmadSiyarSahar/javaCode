package com.class11;

public class ForAdvancedLoop {

	public static void main(String[] args) {
		// lets create an array of names that will hold five elements and retrieve all values from it. 
		//String [] names1// we declare here
		
		String [] names=new String [5];
		names[0]="Asel"; 
		names[1]="Awet"; 
		names [2]="Aref"; 
		names[3]= "Weqas";
		names [4]="Dzmitri";
		names [5]="Shiva"; // will get an runtime exception when trying to access it. 
		names [6]="Sandish";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names [i]);
		}
		
		
		// 2. way of creating an array bu using array literal
		
		String [] studentNames1= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"}; 
		
		for (int i=0; i<=studentNames1.length-1; i++) {
			System.out.println(studentNames1[i]);
		}
		
		// retrieve values using: it is also called advanced for loop, for each loop or enhanced for loop it can be
		// only used with arrays and collections. 
		String [] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"}; 
		for (String student:studentNames) {
			System.out.println(student);
		}
		
		int []numbers= {12, 13, 14, 15, 16, 17};
		for (int myNum:numbers) {
			System.out.println(myNum);
			
			
			
		}
		
	}

}
