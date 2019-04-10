package com.class11;

public class Task {

	public static void main(String[] args) {
		
	//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
	
		  // 1. way
		String []cars=new String [6]; 
		cars[0]="Benze"; 
		cars[1]="Toyota";
		cars[2]="Honda"; 
		cars[3]="Hondai";
		cars[4]="masariti";
		cars[5]="BMW";
		for (int i=0; i<cars.length; i++)
		System.out.println(cars[i]);
				
		
		// 2. way
		
		for (String test:cars) {
			System.out.println(test);
		}
		
//		Create an array of countries. While retrieving all values from an array print capital for each country.
		//(use 2 different loops).
		
		String [] count=new String[4]; 
		count [0]="Afg";
		count[1]="USA";
		count[2]="Turkey";
		count[3]="Iraq"; 
		
		for (int i=0; i<count.length; i++) {
			if (count[i].equals("Afg")) {
				System.out.println("Kabul");
			} else if (count[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (count[i].equals ("Turkey")){
				System.out.println("Ankara");
			}else if (count[i].equals ("Iraq")) {
				System.out.println("Baghdad");
			}
			
			}
		// second way 
		String [] countries= {"USA", "Afg", "Kazakistan"};
		for (String country:countries) {
			switch (country) {
			case "USA": System.out.println("W DC");
			break; 
			case "Afg": System.out.println("Kabul");
			break;
			case "Kazakistan": System.out.println("Astana");
			}
		}
		
//		Create an array on integers and calculate the sum of all elements in an array.
		
		int []a= {1, 2, 3, 4, 5, 6, 7, 8}; 
		int total=0; 
		for (int i=0; i<a.length; i++) {
		total+= a[i];	
		}
		System.out.println("The sum of b is "+total);
		
		// create an array of integers and find the largest number
		 
		 int []p= {1, 2, 3, 4, 5, 7, 9, 0};
		 int max=p[0]; 
		 for (int i=0; i<p.length; i++) {
			if (p[i]>max) max=p[i];
		 }
		 System.out.println("The Max number is "+max);
		 
		 
		 
		}	
	}


