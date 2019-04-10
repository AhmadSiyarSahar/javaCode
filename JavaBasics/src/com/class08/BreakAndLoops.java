package com.class08;

public class BreakAndLoops {

	public static void main(String[] args) {
	
	for (int i=1; i<=5; i++) {
		if (i==5) {
			break; 
		}
			System.out.println(i);
		
	}
	
	//break
	
	for (int g=0; g<=4; g++) {
		System.out.println("Hello");
		break; // break just terminates the loops. 
	}
	// continue
	
	for (int p=0; p<6; p++) {
		if (p==5) {
			continue; 
		}
		System.out.println(p);
	}

	// I want to print numbers from 1-20 but skip those that divisible 
	// by 3
	
	for (int a=1;  a<=20; a++) {
		if (a%3==0) {
			continue; 
		}
		System.out.println(a);
	}
	}

}
