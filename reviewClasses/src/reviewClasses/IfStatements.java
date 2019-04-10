package reviewClasses;

import java.util.Scanner;

public class IfStatements {

	private static final char[] Monday = null;

	public static void main(String[] args) {
	
//	int age;
//	Scanner myAge=new Scanner (System.in);
//	System.out.println("Pleaes enter your age");
//	age=myAge.nextInt();
//	if (!(age>18)) {
//        System.out.println("You are too young.");
//    }else if (age>=18 && age<=35) {
//        System.out.println("You are a youg person.");
//    }else if (age>=36 || age<=99){
//        System.out.println("Your are a middle age person.");
//    }else if(age>=100) {
//        System.out.println("You are too old.");
//    }else {
//        System.out.println("Your are a senior");
//	
//		int day =4;
//        String today;
//		switch (day) {
//        case 1:
//        	today="Monday";
//        	break;
//        case 2:
//        	today="Tuesday";
//        	break; 
//        case 3:
//        	today="Wednesday";
//        	break;
//        case 4:
//        	today="Thursday";
//        	break; 
//        case 5:
//        	today="Friday";
//        default:
//        	today="Weekend";
//        }
//        
//        System.out.println("today is "+today);
		
	int level;
	Scanner myLevel=new Scanner(System.in);
	System.out.println("Pleae enter your experience level");
	level=myLevel.nextInt();
	if (level==1) {
		System.out.println("Your level is beginner.");
	}else if (level==2) {
			System.out.println("You level is intermidaite");
		} else if (level==3) {
			System.out.println("Your level is expert.");
		} else {
			System.out.println("Your level is unknow");
		}
	}
	}


	
