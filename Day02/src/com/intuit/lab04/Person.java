package com.intuit.lab04;

public class Person {
	private String name;
	private Car[] cars; //String[] cars;
	private Person friend; //String friend;
	
	public Person(String theName) {
		name = theName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public Person getFriend() {
		return friend;
	}

	public void setFriend(Person friend) {
		this.friend = friend;
	}
	
}
