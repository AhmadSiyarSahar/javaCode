package com.class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
//			Accept username, password and confirm password and check following requirements:
//			Username and Password cannot be  empty, if so→ message="Username and Password cannot be empty�?.
//			Password should be minimum 8 characters, if less → message=�?Password is too short�?.
//			Password cannot contain username if so, → message=�?Password cannot contain username�?.
//			Password should match confirmed password, if not  → message “Passwords do not match�?.
//			Only after all requirements met → message “Your username and password has been created�?

//		
//		String userName, Password, confirmPassword;
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter your usreName");
//		userName=scan.nextLine(); 
//		System.out.println("Please enter your Password");
//		Password=scan.nextLine();
//		System.out.println("Please confirm your Password");
//		confirmPassword=scan.nextLine();
//		
//		if (!(userName.isEmpty() && Password.isEmpty())) {
//			if (Password.length()>8) {
//				if (!Password.contains(userName)) {
//					if (Password.equals(confirmPassword)) {
//						System.out.println("Your user name and passwor has been created.");
//						
//					}else {
//						System.out.println("Pasword and usrenmae dont match");
//					}
//					
//				}else {
//					System.out.println("Pasword cant contain userName");
//				}
//				
//			}else {
//				System.out.println("Pasword is to short");
//			}
//			
//		} else {
//			System.out.println("Username and Password cannot be  empty");
//		}
//		
		
		String b="saturday is a Good day.";
		boolean c= b.endsWith(".");
		System.out.println(c);
		
	}

}
