package com.class15_2;

public class NestedLoops {

	public static void main(String[] args) {

		NestedLoops demo= new NestedLoops();
		
		demo.prinNumber();
		
				
		}
		
		void prinNumber () {
			for (int h = 0; h < 24; h++) {
				for (int m = 0; m < 60; m++)
					if (m < 10) {
						System.out.println(h + ": 0");
		}
			}
		}
		}

