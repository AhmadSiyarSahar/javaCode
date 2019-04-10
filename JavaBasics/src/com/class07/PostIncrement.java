package com.class07;

public class PostIncrement {

	public static void main(String[] args) {
		// post increment and post decrement 
		// a++;					a--;
	
		int x=10;
		int y=x;
		System.out.println(x+" "+y);
		//Post increment 
		
		int a=299;
		int b=a++; // First assign -->increment  (int b=a; a=a+1)
		System.out.println(a);// 300
		System.out.println(b);//299
		
		//Post decrement 
		
		int z=10;
		int c=z--; //First assign --->decrement (int c=z; z=z-1)
		System.out.println(z); //9
		System.out.println(c);//10
		
	}

}
