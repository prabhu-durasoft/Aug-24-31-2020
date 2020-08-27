package com.intuit.lab07;

public class DoorUser {

	public static void main(String[] args) {
		SoundAlarm alarm = new SoundAlarm();
		Door door = new Door(alarm);
		door.open();
		door.close();
		VisualAlarm visualAlarm = new VisualAlarm();
		door.setAlarm(visualAlarm);
		door.open();
		door.close();
		door.setAlarm(new MessagingAlarm());
		door.open();
		door.close();
	}

}
