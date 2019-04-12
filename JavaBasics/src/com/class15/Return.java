package com.class15;

public class Return {

		public int add(){
		int a=40;
		int b=50;
		int c=a+b;
		return c;
		}
	
	
	
		public static void main(String args[]) {
		Return obj= new Return();
		int x= obj.add();
		System.out.println(x);
		}
	}
	

