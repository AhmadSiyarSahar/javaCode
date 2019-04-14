package com.class18;

public class Employee {
	
	int eID;// Since the id is changeable, we use instance, but we dont write it. if it is not written, it is understood as instance. 
	double Salary; // same as above. 
	static String CEO="Sumair"; // Here we use static for variable CEO. cause the CEO will remain for all. it will not
								// change. 

	public static void main(String[] args) {
		
		
		Employee emp1=new Employee();
		emp1.eID=100; 
		emp1.Salary=90000.00; 
		
		Employee emp2=new Employee();
		emp2.eID=99; 
		emp2.Salary=10000.00; 
		
		emp1.printEmployee();
		emp2.printEmployee();

	}
		void printEmployee () {
			System.out.println("Emp ID is "+eID+ " and he/she has a salary of "+ Salary + " and his/her CEO is "+CEO);
		}
		
}
