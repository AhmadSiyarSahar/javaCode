package com.class06;

import java.util.Scanner;

public class Switch {
public static void main (String[] args) {
	
	
	int myNumber=4;
	switch (myNumber) {
	case 1: 
		myNumber= 777215;
		break;
	case 2: 
		myNumber= 7995830;
		break;
	case 3: 
		myNumber= 83044444;
		break;
	case 4:
		myNumber= 76695830;
		break; 
	default: 
		myNumber= 0;
	}

System.out.println("My phone number was " +myNumber);
	}
}
