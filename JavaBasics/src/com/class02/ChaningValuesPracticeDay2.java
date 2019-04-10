package com.class02;

public class ChaningValuesPracticeDay2 {
	public static void main(String args[]) {

		char grade = 'B';
		grade = 'A';
		grade='c';
		grade='d';
		grade='e';
		System.out.println(grade); 
		String name1="Ahmad";
		name1="Noor";
		name1="Hameed";
		name1="Hayat";
		System.out.println(name1);
		// We can always change the values of our variables as: grade='A';
		// We just use the name of our variable such as grade and then write 
		//the new value that we want to assign. The reason we do not write the type
		//(char) again, is that we have already reserved in Java a bucket for char, 
		//now we are only changing its value.
		// don't do it like: char grade ='A'; if we do it in this method, 
		// we are reserving a new bucket for char in Java.
		// If we want to print it, we will see in console, the value as A.
		// Reason: Java, reads the values from top to bottom and from left to right.
		// Therefore, Java shows us the last value that we have assigned.
		// It does not show us the value as B, because we have already taken out 
		// that value and assigned a new value which is A.
		//char grade2 = 'B'; grade1 = 'A';  System.out.println(grade1); 
		// Java will read it from left to right.  
		// grade = 'C' char = grade= 'D' we can't first change the value and then,
		// identify to Java our type and name and value. vice versa, it should be in
		// reverse, first we should tell Java to give us a place/bucket for the
		// type of data we are putting then, 
		// we should name it and assigned a value and then, we can change the value.
		// Any data we are writing in Java, at the first step, Java
		// reads its type, then its name and then its value. 
		  
		
	}

}
