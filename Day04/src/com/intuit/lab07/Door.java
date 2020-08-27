package com.intuit.lab07;

//Classes should be dependent on abstractions and not on implementations
public class Door {
	private Alarm alarm;
	
	public Door(Alarm theAlarm) {
		alarm = theAlarm;
	}
	public void open() {
		alarm.activate();
	}
	public void close() {
		alarm.deactivate();
	}
	
	public Alarm getAlarm() {
		return alarm;
	}
	public void setAlarm(Alarm alarm) {
		this.alarm = alarm;
	}
	
}

interface Alarm {
	void activate();
	void deactivate();
}

class MessagingAlarm implements Alarm {
	public void activate() {
		System.out.println("MessagingAlarm activated");
	}
	public void deactivate() {
		System.out.println("MessagingAlarm deactivated");
	}
}

class SoundAlarm implements Alarm {
	public void activate() {
		System.out.println("SoundAlarm activated");
	}
	public void deactivate() {
		System.out.println("SoundAlarm deactivated");
	}
}
class VisualAlarm implements Alarm {
	public void activate() {
		System.out.println("VisualAlarm activated");
	}
	public void deactivate() {
		System.out.println("VisualAlarm deactivated");
	}
}