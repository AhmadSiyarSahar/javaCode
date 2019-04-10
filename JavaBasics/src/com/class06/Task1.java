package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
//	Write a program that prints out if it is good weather to go for any activity or not
//	If the temperature is between 40 degrees and 80 degrees inclusive & no rain--> we will go for hiking
//	otherwise--> we will not go hiking
//  If temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
//	we are not going snowboarding
//	it if temperature is more than 80 & sunny--> go to the beach
//		* otherwise --> not go to the beach
		
		
		
		Scanner scan; 
		boolean snow, rainy, sunny;
		int temp;
		String activity;
		scan=new Scanner (System.in);
		System.out.println("Is it snowing");
		snow=scan.nextBoolean();
		System.out.println("Is it rainy");
		rainy=scan.nextBoolean();
		System.out.println("Is it sunny");
		sunny=scan.nextBoolean();
		System.out.println("Please enter temp");
		temp=scan.nextInt();
		
		activity=scan.nextLine();
		if (temp>=40 && temp<=80){
	        if (rainy){
	            activity= "watch movie";            
	        }else {
	            activity="go hiking";
	        }
	}else if (temp >=25 && temp <40){
	    if (snow) {
	        activity="snowboarding";
	    }else {
	        activity="do coding";
	    }
	}else if( temp >80){
	    if (sunny) {
	        activity="go to the beach";
	    }else {
	        activity="do more coding";
	    }
	}else {
	    System.out.println("Please enter different temp");
	    activity="Uknown";
	   
	}
		 System.out.println("please do the following activity");
		System.out.println(activity);
	}

}
