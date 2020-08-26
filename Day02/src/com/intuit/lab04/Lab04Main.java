package com.intuit.lab04;

public class Lab04Main {

	public static void main(String[] args) {
		Person sam = new Person("Sam");
		
		Car bmw = new Car("BMW", "black");
		Engine bmwEngine = new Engine(2000);
		bmw.engine = bmwEngine;
		
		Car santro = new Car("Santro", "yellow");
		Engine santroEngine = new Engine(1000);
		santro.engine = santroEngine;
		
		Person ram = new Person("Ram");
		
		sam.cars = new Car[] { bmw, santro };
		sam.friend = ram;
		
		
	}

}
