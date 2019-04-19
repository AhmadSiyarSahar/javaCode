package com.class21;

public class CallingDegreeeClasses {

	public static void main(String[] args) {
	
		Degree dg=new Degree();
		Undergraduate ug=new Undergraduate();
		Postgraduate pg=new Postgraduate();
		
		dg.getDegree();//Employee gets paid salary
		ug.myMassage();//Full time employee gets paid salary + bonus
		pg.myMassage();//Contractor gets paid hourly
	}

	}


