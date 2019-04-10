package com.class06;

import java.util.Scanner;

public class ClassTask3 {


	public static void main(String[] args) {
		 
       
          
		
        Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter which country you are from");
	    String country=scan.nextLine();
	        
	        String SpokenLanguage;
			switch (country) {
	        
	        case "USA":
	        	SpokenLanguage="English";
	            break;
	        case "Afghanistan":
	        	SpokenLanguage="Pashto";
	            break;
	        case "Russia":
	        	SpokenLanguage="Russian";
	            break;
	        case "Italy":
	        	SpokenLanguage="Spanish";
	            break;
	        case "Turkey":
	        	SpokenLanguage="Turkish";
	            break;
	        case "Morocco":
	        	SpokenLanguage="Arabic";
	            break;
	        default:
	        	SpokenLanguage="Unknown";
	        }
	        System.out.println("Spoken language in your country is "+SpokenLanguage);
	    }
	

	}


