package com.class22;

public class AnimalTest {

	public static void main(String[] args) {

		Animal obj=new Monkey();
		obj.whoAmI();/// Method Hiding ---> we are hiding child class infact we are not overridding. compiler will not give error

	}

}
