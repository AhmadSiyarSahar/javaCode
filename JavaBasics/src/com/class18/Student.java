package com.class18;

public class Student {
	
	// Create a Class called Students Create three  variables  studentNames,studentID  and  numberOfStudents
	// Create three objects of the Students Class Set the value for  studentName ,studentID and increment  the 
	// numberOfStudents for each objectPrint out  total number of students
	
	String studentNames;
	static int numberOFStudennts;
	static int studentID;
	 
	public static void main(String[] args) {
		Student obj1=new Student();
		Student obj2=new Student();
		Student obj3=new Student();

		obj1.studentNames="Alex";
		studentID++;
		System.out.println(numberOFStudennts++ +" "+obj1.studentNames+" "+studentID++ +"");
		
		obj2.studentNames="Alin";
	    studentID++;
		System.out.println(numberOFStudennts++ +" "+obj2.studentNames+" "+studentID++ +"");
		
		obj3.studentNames="Obama";
		 studentID++;
		System.out.println(numberOFStudennts++ +" "+obj3.studentNames+" "+studentID++ +"");
		
		System.out.println("Total number of students " +numberOFStudennts++);

	
		
		
		
	}

}
