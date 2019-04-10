package com.class04;

import java.util.Scanner;

public class ScannerSummary {

	public static void main(String[] args) {
		
	// create scanner object.                        
	Scanner Ahmad=new Scanner (System.in);  // 1- we create scanner obj, then, give it a name, Ctrl+shift+o
	// Ask user to enter smth   			// then, = new Scanner (System.in); 2- then, ask user to enter smth by					 
	System.out.println("Enter your name");  // typing System.out.println ("ask user to enter smth"); 3- then,   
	// wait for the user to enter smth. 
	String Kabul=Ahmad.nextLine();           // we create String, give it a name then = we write name of Scanner
	// Tell user what he/she has entered. 	 // in our case the name of it is, Ahmad.nextLine(); then, 4-
	System.out.println("You enter "+Kabul);  // we tell the user what he/she has entered by typing: 
											// System.out.println("You entered " + name of variable. 
	@SuppressWarnings("resource")			//if the information that user is entering is a number, we create 
	Scanner Siyar=new Scanner (System.in);  // our variable as int, if its text, we create our variable as String
	System.out.println("Please enter your last name"); // if its true or false, we create our variable as boolean.
	String kalak=Siyar.nextLine();						// if its a decimal number, we create variable as double.
	System.out.println("You entered " +kalak); 
	@SuppressWarnings("resource")
	Scanner math=new Scanner(System.in);
	System.out.println("Please enter your age");
	int age=math.nextInt();
	System.out.println("you entered "+age);
	@SuppressWarnings("resource")
	Scanner Tassall=new Scanner (System.in);
	System.out.println("Please enrer your daughter's name");
	String Daug=Tassall.nextLine();
	System.out.println("You entered your daughter's name as " +Daug);
	}


}
