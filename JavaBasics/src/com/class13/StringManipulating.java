package com.class13;

import javax.sound.midi.MidiDevice.Info;

public class StringManipulating {

	public static void main(String[] args) {
		/// Create a String and print it in reverse order (Sunday  yadnuS).
		
		String a="Sunday";
		for (int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
		
		String d="Siyar";
		for (int i=d.length()-1; i>=0; i--) {
			System.out.print(d.charAt(i));
		}
		System.out.println();
		
		String z="Zahir lala";
		for (int i=z.length()-1; i>=0; i--) {
			System.out.print(z.charAt(i));
		}
		
		System.out.println("");
		String b1="Basir lala";
		for (int i=b1.length()-1; i>=0; i--) {
			System.out.print(b1.charAt(i));
		}
		
		
		
		System.out.println(" ");
		
		String h="Bashir lala";
		for (int i=h.length()-1; i>=0; i--) {
		System.out.print(h.charAt(i));
		}
		
		System.out.println("");
		
		
		String g="GUl Ahmad";
		for (int i=g.length()-1; i>=0; i--){			
		
		System.out.print(g.charAt(i));
		}
// Create a String and if the String is not empty perform the following: 
// if the String has an odd number of characters and has 3 or
//  more characters, print the character in the middle of the String.
		
		
		String b="Today is a java day";
		if (b.length()%2!=0 && b.length()>3) {
			System.out.println(b.charAt(b.length()/2));
		}
		
		String j= "How are you today?";
		if (j.length()%2==0 && j.length()>5) {
			System.out.println(j.charAt(j.length()/2));
		}
		
		
		

	}

	
}