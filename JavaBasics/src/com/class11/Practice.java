package com.class11;

public class Practice {
	public static void main (String [] args) {
		
		String [] a= {"Ahmad", "Siyar","Sahar", "Basir", "Safir"};
			for (String b:a) {
				System.out.println(b);
			}
			
		int []c= {1, 2, 4, 5, 6, 7, 8};
			for (int d:c) {
				System.out.print(d+", ");
			}
			int sum=0; 
			for (int e:c) {
				sum+=e; 
				System.out.println(sum);
			}
		
		String [] cars=new String [6]; 
		cars[0]="Benz";
		cars[1]="Maserati";
		cars[2]="Toyota";
		cars[3]="Honda";
		cars[4]="Hundi"; 
		cars[5]="Jeep";
		for (int i=0; i<cars.length; i++ )
		System.out.println(cars[i]);
		System.out.println("....................................");
		
		for (String motors:cars) {
			System.out.println(motors);
		}
		
		//// using if and else if 
		String[]countries= {"Afg","Pak","Ind"};
		for (int i=0; i<countries.length; i++) {
			if (countries[i].equals ("Afg")) {
				System.out.println("Kab");
			}else if (countries [i].equals("Pak")) {
				System.out.println("ISL");	
			}else if (countries[i].equals("Ind")) {
				System.out.println("New");
			}
		}
		
		//// using Switch 
		
		String []country= {"USA", "Japan","Turkey"};
		for (String count:country) {
			switch (count) {
			case "USA":
			System.out.println("DC");
			break; 
			case "Japan":
				System.out.println("Jan");
				break; 
			case"Turkey":
				System.out.println("Ankara");
				break; 
			
			}
		}
		
		// Create an array on integers and calculate the sum of all elements in an array.
		
		int []z= {1, 2, 3,5 , 67,};
		int total=0; 
		for (int i=0; i<z.length; i++)
		total+=z[i]; 
		System.out.println(total);
		
		
		int []x= {100, 200, 300, 400, 500};
		int sum1=0; 
		for (int i=0; i<x.length; i++)
		sum1+=x[i]; 
		System.out.println(sum1);
		
		int []y= {1, 22, 5,7,88};
		int sum2=0; 
		for (int i=0; i<y.length; i++) {
			 sum2+=y[i];
			 }
		System.out.println(sum2);
		
		int []t= {1,2,4,5,6,7}; 
		int max= t[0]; 
		for (int i = 0; i<t.length; i++) {
			if (t[i]>max)
			max=t[i]; 
		} System.out.println(max);
		 
			int []s= {1,3,5,7,9};
			int min=s[0];
			for (int i=0; i<s.length; i++) {
				if (s[i]<min)
					min=s[i]; 
			}System.out.println(min);
				
			
			int[]r= {1,2,4,7,9,0}; 
			int maxim=r[0];
			int mini=r[0];
			int sum3=r[0];
			for (int i=0; i<r.length; i++) {
				if (r[i]>maxim)
					maxim=r[i];
				if (r[i]<mini)
					mini=r[i];
				sum3+=r[i];
					
			} System.out.println(maxim); System.out.println(mini); System.out.println(sum3);
			
			/// Multidimensional Arrays
			
			int [][]ro= {
					{1,2, 4, 6,7},
					{3,5,7,8,9},
					{9,8,7,6,5,4,3}	
			}; System.out.println(ro[1][4]);
			
			
			String [][]names= {
					{"Mr.", "Ms.","Mrs.","Mss."},
					{"Shafiqa", "Tassalla", "Shabnam", "Siyar", "Sahar"}	
			}; System.out.println(names [0][0] + " "+names [1][4]);
			
			String [][]students= {
					{"Siyar", "Tassalla", "Shabnam"},
					{"A","B","c"}		
			}; System.out.println(students [0][1]+" got " + students [1][0]);
			
			int [][]num= {
					{1,3,5,7,9},
					{2,4,6,8,10},
					{9,7,5,3,1}	
			}; 
			
			for (int row=0; row<num.length; row++) {
				for (int col=0; col<num[row].length; col++) {
				System.out.print(num[row][col]);
				}
			}
			
			
			String [][]Food= {
					{"Nan", "Onion", "Tomato"}, 
					{"Badran", "Moly", "Romian"},
					{"Palek", "Bindy", "Shalgham", "Kado"}
			};
			for (int i=0; i<Food.length; i++) {
				for (int j=0; j<Food[i].length; j++) {
					System.out.println(Food[i][j]+" "); 
				}
			}
			
			String [][]cars1= {
					{"Honda", "Hondai", "motor", "maserati"},
					{"toyota", "corolla", "bmw", "benze"},
					{"Khaki", "Tayara", "Holicopter"}	
			};
			
			for (int i=0; i<cars1.length; i++) {
				for (int j=0; j<cars1[i].length; j++) {
					System.out.println(cars1[i][j]); 
				}
			}
		}
	
		
	}	
	


