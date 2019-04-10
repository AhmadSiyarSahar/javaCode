package com.class04;

public class ClassTask {

	public static void main(String[] args) {
		// // Store variable to store mortgage price
		// first check if the rate is higher than 4.5, user will not buy a house.
		// otherwise, will buy it/
		// second if price of the house is larger than 200000 than user will take loan
		// otherwise user will
		// pay cash.
		double mort = 4.3;
		double affordAble = 4.5;
		int price = 100000;
		if (mort < affordAble) {
			System.out.println("user will buy it");
			if (price < 200000) {
				System.out.println("will cash");
			} else {
				System.out.println("will apply for a loan");
			}
		} else {
			System.out.println("user will buy not it");
		}

		// ask user to enter numbers of worked years and anual salary
		// if user worked for more or equal to 5 years than user is eligible for the
		// bonus.
		//

	}

}
