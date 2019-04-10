package com.class07;

public class ForLoop {
	public static void main(String[] args) {
		int a=10;
		a=a+10;
		System.out.println(a); //20
		
		int b=100;
		b=b+100;
		System.out.println(b);//200
		
		int c=100;
		c+=100; //c=c+100;
		System.out.println(c);//200
		c+=35; //235
		System.out.println(c); //235
		c+=50;//c=c+50 ==>285
		
		//1.
		int z=2;
		z=z+100; 
		System.out.println(z);
		
		//2. 
		z=z-67; 
		System.out.println(z);
		
		//3. 
		
		int cakePiece=11;
		cakePiece/=4; 
		System.out.println(cakePiece);
		
		int cakePiece1=25;
		 cakePiece1%=7; 
		System.out.println(cakePiece1);
		
	}
}
