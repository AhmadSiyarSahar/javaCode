package groupWork;

public class Increment {

	public static void main(String[] args) {
		
		// if it is post decrement or increment fist we do the operation and then increment or decrement 
		// from the original value. 
		
		int a=10; 
		int b=2; 
		int Final= a*b++; 
		System.out.println(Final);
		System.out.println(b);
		
		// if it is pre decrement or increment frist we do the decrement or increment and then we do the operioant. 
		
		int a1=10; 
		int b1=2; 
		int Final1=a*b1--; 
		System.out.println(Final1);
		System.out.println(b1);
	}

}
