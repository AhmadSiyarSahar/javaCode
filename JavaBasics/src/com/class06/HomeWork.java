package com.class06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

	// Using scanner class create calculator. Allow user to enter 2 numbers and
	//operator(+,-,*,/). Based on operator provide the result to user.
		
	Scanner calculator=new Scanner (System.in);
	double fNum, sNum, tNum, fNumt, result, result1, result2, result3; 
	System.out.println("Please enter the first number.");
	fNum=calculator.nextDouble();
	System.out.println("Please enter the second number.");
	sNum=calculator.nextDouble();
	System.out.println("Please enter the third number.");
	tNum=calculator.nextDouble();
	result=fNum+sNum-sNum*tNum/fNum;
	result1=fNum-sNum;
	result2=fNum*sNum;
	result3=fNum/sNum;
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	}

	}


