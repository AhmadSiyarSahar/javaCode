package com.class17;

public class Student {

	public static void main(String[] args) {

		/* Create a class Student that will have a method getGrade your method should accept the score of a student and 
		 * return a grade.
		 * score>90 -A
		 * score >80-B
		 * score >70-c
		 *score >50-d
		 *anything else -f 
		 */
		
		Student ojb=new Student ();
		char grade=ojb.getGrade(91);
		System.out.println("My grade is "+grade);
		
}
	
	char getGrade(int Score) {
		char grade;
	
		if (Score>90) {
			grade='A';
		}
		else if (Score>80) {
			grade='B';
	}
		else if (Score>70) {
			grade='C';

}
		else if (Score>70) {
			grade='C'; 
		}
			
			else {
			grade='A';
			}
		return grade;
		}
	}