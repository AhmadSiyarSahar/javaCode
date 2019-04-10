package com.class10;

public class Arrays {

	public static void main(String[] args) {
		
		// in Java index always starts with 0. 
		
		int [] array1;// declare an array-----> preferred way 
		int [] array2; // declare an array
		int array3[]; // declare an array
		
		// initializing or creating the array.
		
		array1=new int[4];
		// assigning the values. 
		
		array1[0]=10;
		array1[1]=20;
		array1[2]=30; 
		array1[3]=40; 
		
		// access the values
		
		System.out.println(array1[1]);
		
		// declaring and initializing together; when we initialize, we 
		// we can specify the size of the container. but when we declare
		// we can't specify the size of the container. 
		int []numbers=new int[3];
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15; 
		System.out.println(numbers[2]);
		
		String []a=new String [3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		System.out.println(a[1]+" friends");
		
		int []b=new int[4]; // 
		b[0]=1;
		b[1]=5; 
		System.out.println(b[3]); // by default 0. 
		
		// Shorter way to create arrays it is called array literal.
		   //index--> 0    1   2   3
		int []array= {10, 20, 30, 40}; 
		System.out.println(array[2]);
		System.out.println(array.length);// to find the size of an array. 
		
		// String of names -5; 
		
		String [] names= {"Siyar", "Ahmad", "Tassalla", "Zaheer", "Bashir"};
		System.out.println("There are "+names.length+ " names in your array");
		System.out.println(names [2]);
		
		
// 1.Create an array of chars and store grades into it: A,B,C,D,E,F.
// Then print a grade B (use 2 different ways of creating an array).
	// First way	
		char []z=new char[6];
		z[0]='A';
		z[1]='B';
		z[2]='C';
		z[3]='D';
		z[4]='E';
		z[5]='F';
		System.out.println(z[4]);
		
	// second way
		char [] y= {'A', 'B', 'C', 'D' ,'E' , 'F'};
		System.out.println(y[2]);
		
// 2.Create an array of names and store all names of your group. 
//Then print your name from that array. (use 2 different ways of 
// creating an array).
		
	// First way 
		String []names1=new String[4];
		names1[0]="Ahmad";
		names1[1]="Siyar";
		names1[2]="Sahar";
		names1[3]="Tassalla";
		System.out.println(names1[2]);
		
	// second way shortcut
		
		String [] n= {"Ahmad","Siyar", "Sahar","Tassalla"}; 
		System.out.println(n[1]);
		
//3.Create an array of words: Java, Saturday, day, coding, is. 
//Print the following sentence using element of array: 
//“Saturday is Java coding Day”.
		
		String []c=new String [5];
		c[0]="Java";
		c[1]="Saturday";
		c[2]="day";
		c[3]="coding";
		c[4]="is";
		System.out.println(c[1]+ " " +c[4]+ " " +c[0]+" "+c[3]+" "+c[2]);
		
		// second way shorter way
		
		String [] d= {"Java", "Saturday", "day", "coding","is"}; 
	
		String sentence= d[1]+ " "+ d[4]+" "+d [0]+" "+d[3]+" "+d[2];
		System.out.println(sentence);
		
		// summing all elements of an array
		
		int []x = {1, 2,4, 5, 6,7,8,9}; 
		int sum =0; 
		for (int i=0; i<x.length; i++) {
		sum+=x[i];	
		}
		System.out.println("The sum of these numbers is "+sum);
		
	}

}
