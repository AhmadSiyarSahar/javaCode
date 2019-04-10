package com.class06;

public class Switche {

	public static void main(String[] args) {
		
		 int day=7;
	     String dayName;
	        if (day==1) {
	            dayName="Mon";
	            
	        }else if (day==2) {
	            dayName="Tue";        
	        }else if (day==3) {
	            dayName="wed";            
	        }else if(day==4) {
	            dayName="thur";
	        }else if (day==5) {
	            dayName="Fri";
	            
	        }else if (day==6) {
	            dayName="Sat";
	            
	        }else if (day==7) {
	            dayName="Sun";
	        }else {
	            dayName="invalid";
	        }
	    System.out.println("Today is "+dayName);    
	 
	    //Switch 
		
	    switch (day) {
	    case 1: 
	    	dayName="Monday";
	    	break;
	    case 2:
	    	dayName="Tuesday";
	    	break;
	    case 3:
	    	dayName="Wednesday";
	    	break;
	    case 4:
	    	dayName="Thursday";
	    	break;
	    case 5:
	    	dayName="Friday";
	    	break;
	    case 6:
	    	dayName="Saturday";
	    	break;
	    case 7:
	    	dayName="Sunday";
	    default:
	    	dayName="invalid";
	    	
	    }
	    System.out.println("Today is " +dayName);	
	    }
	

	}


