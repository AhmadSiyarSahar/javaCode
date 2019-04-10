package com.class14;

public class Phone {

		
// Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes 
// and behaviours.


String make, color, screen; 
int year, size, price; 

public static void main(String[] args) {
	
	// 1- lets define its atributes. 
	Phone phone1= new Phone();
	
	phone1.make="Apple"; 
	phone1.color="Black";
	phone1.screen="colorful";
	phone1.year=2018;
	phone1.size=6; 
	phone1.price=1000; 
	
	
	// 2- lets define its action. 
	
	phone1.calling();
	phone1.texting();
	phone1.playingGame();
	phone1.watchMovie();
	
	
	Phone phone2=new Phone();
	
	phone2.make="Android";
	phone2.color="White";
	phone2.screen="Black and White";
	phone2.year=2005; 
	phone2.size=4; 
	phone2.price=200; 
	
	
	phone2.calling();
	phone2.texting();
	phone2.playingGame();
	
	
	
	Phone phone3=new Phone();
	
	phone3.make="Nokia";
	phone3.color="Silver";
	phone3.screen="colorful";
	phone3.year=2002; 
	phone3.size=3; 
	phone3.price=150; 
	
	
	phone3.calling();
	phone3.texting();
	phone3.playingGame();
	
}

 void playingGame() {
	System.out.println("we can paly games. "+make +" phone");
}

void calling() {
	
	System.out.println("we can call from "+make +" phone");
	
}

void texting() {
	System.out.println("we can text from "+make+ " phone");
	
}

void watchMovie() {
	
	System.out.println("we can wtach movie inn"+make+" phone");
	
	}


}
	
	

