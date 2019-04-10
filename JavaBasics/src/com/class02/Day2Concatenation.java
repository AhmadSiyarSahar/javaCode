package com.class02;

public class Day2Concatenation {

	public static void main(String[] args) {
		String name="Ahmad";
		String lastName="Sahar";
		String grade="University";
		char grade1='B';
		String city="Reston";
		String state="Virginia";
		String ph="5714987994";
		String Faculty= "Law";
		String Major = "Lawyer";
		String city1 = "Herat";
		char Position = 'C';
		char cla = 'A';
		byte ID= 100; 
		String a = "hi";
		String b= "bye";
		int c=2;
		int d =3;
		System.out.println(a+b+c+d);
		System.out.println(a+c+b+d);
		
		String name1 = "Ahamd Siyar";
		System.out.println ("My name is " + name1); // The sign + concatenates (joins)
		// two or more statements (strings) and variables.
		//Concatenation of two statements (Strings)
		System.out.println ("My name is Ahmad" + " My last name is Sahar.");
		//Concatenation of a string and a variable:
		System.out.println ("My name is Ahmad" + " and I am in class " +cla+".");
		// Concatenation of two strings and two variables:
		System.out.println ("I studied " +Faculty+ " and I am a " +Major+"."); 
		// When we join variable, we write it inside the + sing. 
		System.out.println ("My name is " + name + " and my last name is " +lastName+ " I have studied " +grade+ " and my grade is " +grade1+ 
				" and I live in "+city+ ", "+ state+"."); 
		
		System.out.println ("I studied "+Faculty+" and I am a "+Major+" in "+city1+".");
		System.out.println("I am a student of " + grade + "  and I live in " + city +" state of "+state+".");
		System.out.println ("and my phone number is "+ ph+" and my grade is "+grade1+".");
		System.out.println ("I am in calss "+cla+" and my position is "+Position+" and my ID number is "+ID+".");
		
		System.out.println("My name is "+name+" and my lastName is "+lastName+"."); 
        // 	When we want to print concatenation, first, we should use it inside (" second, , We write our statement, 
		//  third, we write our variable as "+name of the variable+" Fourth, we write our next statement,
		//  fifth, we write our next variable as "+name of variable+" Then, put full stop and then close the double 
		//  quotation and then close the parenthesis and at last put ; 
		
		}

}
