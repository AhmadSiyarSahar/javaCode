package com.class17;

public class Task {

	public static void main(String[] args) {

		// create a method createEmail() Based on the provided users name, lastName, and
		// email type, your method
		// should return complete email address;

		Task obj = new Task();
		String email = obj.createEmail("John", "Snow", "gmail");
		System.out.println(email);

		email = obj.createEmail("Bob", "snow", "outlook");
		System.out.println(email);

	}

	// return type methodName
	String createEmail(String name, String lastName, String emailType) {
		String email = name + lastName + "@" + emailType;
		return email.toLowerCase();

	}
	

}
