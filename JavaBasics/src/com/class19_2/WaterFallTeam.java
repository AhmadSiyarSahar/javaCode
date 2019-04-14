package com.class19_2;

import com.class20.Employee;

public class WaterFallTeam extends Employee {
	
	public static void main(String[] args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		//wt.salary1=23;
		//wt.salary1=2345; 
		wt.salary1=90000;
		// protected members (var and methods) can be accessed from different package through inheritance only
		// wt.salary; // default values cant not be accessed in differnet packages. 
		
	//	wt.test(); // avvailable cause it is protected mehtod in the employee class.
		// wt.test1(); can not be accessed vcause it is a default mehtod in the employee class. 
	}
	
	

}
