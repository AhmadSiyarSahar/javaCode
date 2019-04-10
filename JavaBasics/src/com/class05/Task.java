package com.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		System.out.println("Please entre your age");
		int height = age.nextInt();
		if (height > 1 && height < 5) {
			System.out.println("you are short.");
		} else if (height >= 5 && height < 6) {
			System.out.println("you are medium");
		} else {
			System.out.println("you are tall");
		}

		// Write a program that will read three inputs of scores (quiz, mid term, and
		// final scores)
		// and determine the grade based on the following rules:
		// if the average score >=90 =>grade=A
		// if the average score >= 70 and <90 => grade=B
		// if the average score>=50 and <70 =>grade=C
		// if the average score<50 =>grade=F

		int quiz, midTerm, finalScore;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your score of quiz");
		quiz = input.nextInt();
		System.out.println("Please enter your score of midTerm");
		midTerm = input.nextInt();
		System.out.println("Please enter your finalScore");
		finalScore = input.nextInt();
		int averageScore = quiz + midTerm + finalScore / 3;
		System.out.println("Your average score is " + averageScore);
		if (averageScore >= 90) {
			System.out.println("A");
		} else if (averageScore >= 70 && averageScore < 90) {
			System.out.println("B");
		} else if (averageScore >= 50 && averageScore < 70) {
			System.out.println("C");
		} else if (averageScore < 50) {
			System.out.println("F");
		}

	}

}
