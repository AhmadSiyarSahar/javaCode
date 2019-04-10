package com.class06;

import java.util.Scanner;

public class Pract {

	public static void main(String[] args) {
	
	Scanner	scan=new Scanner (System.in);
	System.out.println("Please enter your country");
	String SpokenLanguage;
	String Country=scan.nextLine();
	
	switch (Country) {
	case "USA":
		SpokenLanguage="English";
		break;
	case "Turkey":
		SpokenLanguage="Turkish";
	case "Afghanistan":
		SpokenLanguage="Farsi";
	default:
		SpokenLanguage="unknow";
	}
	System.out.println("The spoken language in your country is " + SpokenLanguage);	
		
	}

}
