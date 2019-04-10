package com.class11;

public class MultiDeminsionalArrays {

	public static void main(String[] args) {
		// creating 2D array:

		// First way using new key word.
		// creating arrays of {12, 13, 14, 15}, {1, 2, 3,4}, {5, 10, 15, 20}, {100, 200,
		// 300, 400}

		int[][] a = new int[4][4]; // The first bracket is row and the second one is column.
		// 1 row
		a[0][0] = 12;
		a[0][1] = 13;
		a[0][2] = 14;
		a[0][3] = 15;

		// 2 row

		a[1][0] = 10;
		a[1][1] = 100;
		a[1][2] = 20;
		a[1][3] = 50;

		// 3 row

		a[2][0] = 100;
		a[2][1] = 10;
		a[2][2] = 200;
		a[2][3] = 500;

		System.out.println(a[2][3]);

		// Creating 2D without using new key word.

		int[][] c = { { 12, 13, 14, 15 }, { 1, 2, 3, 4 }, { 5, 10, 15, 20 }, { 100, 200, 300, 400 } };

		System.out.println(c[3][1]);
		
		// Task
		
		String [] []names= {
				{"Mr.", "Mrs.", "Ms.", "Miss."}, 
				{"Smith", "Jordan", "Jackson", "Obama"}
		}; System.out.println(names [0][1] +" "+ names [1][0]);
		
		System.out.println(names [0][0] +" "+ names [1][3]);
		System.out.println(names [0][2] +" "+ names [1][2]);
		System.out.println(names [0][3] +" "+ names [1][1]);
		
		// create a 2D array that first row will contain 4 names and second row will contain grades. Then your prog
		// should print name of the student that has an A and B grade. 
		
		String [][] students={
				{"Siyar", "Seyit", "Mehmet", "Bekir"}, 
				{"A","B"}, 
			
		};System.out.println(students [0][0]+" "+students[1][1]);
		
		
		
		
		  int[][] num= {
	                {11,12,13,14},//4
	                {21,22,23},//3
	                {31,32,33,34}//4
	        };
//	      int rows=num.length;
//	      System.out.println(rows);
//	      
//	      int cols=num[2].length;
//	      System.out.println(cols);
	        
	        for (int row=0; row<num.length; row++) {
	            
	            for (int col=0; col<num[row].length; col++) {
	                System.out.print(num[row][col]+" ");
	            }
	            System.out.println();
	        }
	        
	        String[][] food= {//3,4
	                {"burger", "fries", "hot dog", "meatloaf"},//1 array or 1 row
	                {"lo mein", "fried rice"},
	                {"biriyani", "korma", "naan", "chick peas"}
	        };
	        
	        for (int i=0; i<food.length; i++) {
	            
	            for (int j=0; j<food[i].length; j++) {
	                System.out.print(food[i][j]+" ");
	            }
	            System.out.println();
	        }
	        
	        String [][] cars = {
	        		{"Doge", "Jeep", "ford"},
	        		{"Audi", "BMW", "Opel"}, 
	        		{"Hundai", "Ssang Yong"},
	        		{"Lamborgni", "Maserati", "Pagani"}	
	        }; for (int i=0; i<cars.length; i++) {
	        	for (int d=0; d<cars[i].length; d++) {
	        	System.out.print(cars[i][d]+" ");
	        } 
	        	System.out.println();
	    }
	        
	        double[][] a1 = {
	    			{1.4,2.0,3.3,2},
	    			{4,1.5,6.1,1},
	    			{1.2,3.1,4,1.6}
	    		}; for (int i=0; i<a1.length; i++){
	    			for (int j=0; j<a1[i].length; j++) {
	    				  System.out.println(a1[i][j]*2);
	    			}
	    		
	    		}
	}
}
	    	

	   		
	


