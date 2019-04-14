package com.class20;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(" ........ Creatring emlpyee obj...................");
		
		Employee emp=new Employee();
		System.out.println("employee.department");
		Employee.work(); // not prefered way
		emp.salary=90000; // we can only access to these two because we create the empl class obj. 
		emp.getPaid(); // we can only access to these two because we create the empl class obj.
		

		System.out.println(" ........ Creatring ScrumTeam obj...................");
		
		ScrumTeam st= new ScrumTeam(); 
		ScrumTeam.work();
		st.salary=100000; 
		st.getPaid();
		st.artifacts="Product balcklog, sprint backlog, burndown chart";
		st.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		
		System.out.println(" ........ Creatring Developer obj...................");
		
		Developer dev=new Developer();
		Developer.work();// 
		dev.salary=120000; 
		dev.getPaid();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		dev.attendScrumMeetings();
		dev.code(); // it from his own 
		
		

		System.out.println(" ........ Creatring Tester obj...................");
		
		Tester qa=new Tester();
		qa.salary=120000; 
		qa.getPaid();
		qa.artifacts="Sprint backlog";
		qa.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		qa.attendScrumMeetings();
		qa.Testing();
		
		
		
System.out.println(" ........ Creatring Bus Analyis obj...................");
		
		BuissnessAnalyss ba=new BuissnessAnalyss();
		ba.salary=150000; 
		ba.getPaid();
		ba.artifacts="Sprint backlog";
		ba.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		ba.attendScrumMeetings();
		ba.wrtieUsersStories();
		
		
System.out.println(" ........ Creatring Scrum MASTER obj...................");
		
		ScrumMaster sm=new ScrumMaster();
		sm.salary=110000; 
		sm.getPaid();
		sm.artifacts="Sprint backlog";
		sm.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		sm.attendScrumMeetings();
		sm.driveScrummetting();
		
		
		
System.out.println(" ........ Creatring Product owner obj...................");
		
		ProductOwner  po=new ProductOwner();
		po.salary=140000; 
		po.getPaid();
		po.artifacts="Sprint backlog, product baklog";
		po.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.proiritizeBacklog();
		po.talkToTheClient();
		
		
		
System.out.println(" ........ Creatring Front End Develper obj...................");
		
		FrontEnd  fe=new FrontEnd();
		fe.salary=85000; 
		fe.getPaid();
		fe.artifacts="Sprint backlog, product baklog";
		fe.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.doesHTML();
		
		
		
System.out.println(" ........ Creatring Back End Develper obj...................");
		
		BackEnd  be=new BackEnd();
		be.salary=85000; 
		be.getPaid();
		be.artifacts="Sprint backlog, product baklog";
		be.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		be.workOnArtifacts();
		be.attendScrumMeetings();
		be.doSql();
		
	
		
System.out.println(" ........ Creatring Manuulay Tester obj...................");
		
		ManualTester  mt=new ManualTester();
		mt.salary=85000; 
		mt.getPaid();
		mt.artifacts="Sprint backlog, product baklog";
		mt.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.testManually();
		
		
		
System.out.println(" ........ Creatring  Automation Tester obj...................");
		
		AutomationTester  at=new AutomationTester();
		at.salary=85000; 
		at.getPaid();
		at.artifacts="Sprint backlog, product baklog";
		at.ceremonies="Sprint grooming, Sprint Planing, daily standup, sprint demo, sprint retro ";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.codeInJava();
	}

}
