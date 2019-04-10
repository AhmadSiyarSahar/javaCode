package com.class08;

public class Practice2 {

	public static void main(String[] args) {
		//Print numbers from 1-100
				for (int z=1; z<=100; z++) {
					System.out.print(z);
				}
				// print from 100-1
				for (int x=100; x>=1; x--) {
					System.out.print(x);
				}
				//print odd numbers from 1-20
				 
				for (int y=1; y<=20; y+=3) {
					System.out.println(y);
				}
				
				//print even numbers from 20-1
				
				for (int h=20; h>=1; h-=2) {
				System.out.println(h);	
				}
				
				//print even numbers 20 and 50
				//1. way
				for (int l=20; l<=50; l+=2) {
					System.out.println(l);
				
				}
			
				//print odd numbers between 20 and 50
				
				for (int j=50; j>=20; j-=3) {
					System.out.println(j);
				}
				
				int sum=0;
				for (int i=1; i<=5; i++) {
					sum=sum+i; 
					System.out.println(sum);
				}
//				
				//find sum of all even number from 1 - 100
				
				int sum1=0;
				for (int p=1; p<=100; p+=2) {
					sum1=sum1+p;
				}
				System.out.println(sum1);	
	
		for (int r = 1; r <= 10; r++) {
			if (r == 7) {
				break;
			}
			System.out.println(r);
		}

		for (int a = 1; a <= 20; a++) {
			if (a % 3 == 0) {
				continue;
			}
			System.out.println(a);
		}
		
		for (int j=1; j<=30; j++) {
			if (j%3==0) {
				continue; 
			}
			System.out.println(j);
		}
		
		for (int u=0; u<=20; u++) {
			if (u%3==0) {
				continue; 
			}
			System.out.println(u);
		}
		for (char z='a'; z<='m'; z++) {
		if (z=='d' || z=='g' || z=='j') {
			continue; 
		}	
		System.out.println(z);
		}
		
		for (char x='a'; x<='z'; x++){
			if (x=='w') {
				break; 
			}
			System.out.println(x);
		}
		
	}
}
