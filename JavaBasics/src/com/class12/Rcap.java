package com.class12;

public class Rcap {

	public static void main(String[] args) {
		
		int [][] arr= { /// This is array of arrays.
				{1, 3, 5}, /// 1 array that stored with indext 0;
				{2, 4, 68}, /// 2 array with indext 1; 
				{100,200,300} /// 3rd array with index 2.
		};
		
		for (int row=0; row<arr.length; row++) //// To process 2D arrays we use nested if. 
			for (int column=0; column<arr[row].length; column++) {
				System.out.print(arr[row][column]+ " ");
			}
				System.out.println();
				
				System.out.println(".......................................");
				
				
			/// for enhanced loop with 2D ARRAYS.
		// loop through each element inside 2D array----> each element=array		
		for (int [] singleArray:arr) { // arr is the bigger array, we need to break it down to single dimension array from 2D.
			for (int numbers:singleArray) {// then, we need to assign the each single array's numbers to a new variable. 
				System.out.print(numbers +" ");
			}
			System.out.println();
		}
		
		
//		/* Create a grocery list:   fruits {}
//		 * 							vigitables{}
//		 * 							dairy{}
//		 * Retrieve all values using 2 different loops. 						
//		
		
		 String [][] list= {
				 	
				 {"Apple", "Banana", "Strawberry", "Kiwi"},
				 {"Tomato", "Bean", "Onion", "Spinach"},
				 {"Milk", "Cheese", "Yougourt"}	 
		 };
		 		for (int row=0; row<list.length; row++) { // list.length gives us the numbers of arrays inside the 2D (bigger array). 	
		 		 for (int col=0; col<list[row].length; col++) { // to go inside each array we use it. 
		 			 System.out.print(list [row][col]+", ");
		 			 
		 		 }
		 			System.out.println();
		 		}
		 			
		 			for (String[] order:list) {
		 				for (String Tassi:order) {
		 					System.out.print(Tassi +" ");
		 				} 
		 					System.out.println();
		 			}
		 
		 
		
					
	}

}
