package com.pattern.behavioral.observer;

public interface Observer {
	// method to update the observer, used by subject.  View updated by Model ----(Control work as presenter)
	public void update();
	
	// attach with subject to observe ----- coupled code 
	public void setSubject(Subject sub);
}
