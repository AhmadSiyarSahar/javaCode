package com.class20;

public class ScrumTeam extends Employee { // on the right of extends the parent comes and on left the child comes.

	public String artifacts; 
	public String ceremonies; 
	
	
	public void workOnArtifacts () {
		System.out.println("Srum team works on "+artifacts);
	}
	
	public void attendScrumMeetings () {
		System.out.println("Scrum Team attends "+ceremonies);
	}
}
