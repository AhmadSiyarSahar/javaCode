package com.class19;

public class SyntaxStudents {
	
	// schoolName ====> is a static var
	//batchNum =====> is static var
	//sutdentName
	//stdudentLasName
	
	// to create a mehtod to get sudentDetails. 
	
	// The main role of a construtor is to initialize instance variable. 
	
	public static String  schoolName ="Syntax";
	public static int batchNumber =4; 
	
	
	public String studentName; 
	public String studentLastName;
	
	
	public SyntaxStudents (String name, String lastName) {
		studentName=name;
		studentLastName=lastName; 
	}
	
	
	public void getStduentDetails () {
		String details ="I am a student at"+ schoolName+ "from batch "+batchNumber+ "and my name is"+studentName+" "+studentLastName; 
		System.out.println(details);
	}
	
}
