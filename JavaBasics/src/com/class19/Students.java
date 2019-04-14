package com.class19;

public class Students {
	/**
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name. NOTE: please male
	 * different names for instance and local variables.
	 */
	
	Students(String name, int score1, int score2, int score3 ){
		System.out.print("Name of studet" + name);	
		
		System.out.println("Average score: " + (score1 + score2 + score3)/3);
		
//		 average(score1 , score2 , score3);
		
	}
	
	
	static double average(int score1, int score2, int score3) {
		
		return (score1 + score2 + score3)/3;
	}
	
	public static void main(String[] args) {
		Students obj=new Students ("Siyar ", 86, 87,80);
		System.out.println(obj.average( 86, 87,80));
	}
	
	
	
	
	

}
