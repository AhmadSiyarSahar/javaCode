package groupWork;

public class IfClass {

	public static void main(String[] args) {
		int a=11; 
		int b=5; 
		if (a>b) {
			System.out.println("The largest number is "+a);
		} else {
			System.out.println("The largest number is " +b);
		}
		if (a%2==0) {
			System.out.println("it is an even number");
		} else {
			System.out.println("it is odd number");
		}
		 int age=25; 
		 int weight=50;
		
		 
		 if (age>=18) {// start of your outer condition; 
			
		 if (weight>50) { 
				 System.out.println("you can donate");
			 } 
			 else if(weight==50) { System.out.println("may be");
			 }
			 else {
				 System.out.println("YOu can't donate");
			 }
		
	} // end of outter condition;  
		 
		 else {
		System.out.println("You are too young");
	}
		 
		
		 
		 
	}
}


