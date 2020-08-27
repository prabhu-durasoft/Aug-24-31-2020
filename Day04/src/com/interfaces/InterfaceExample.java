package com.interfaces;

public class InterfaceExample {

	public static void main(String[] args) {
		//Vehicle vehicle = new Vehicle(); //Interfaces cannot be instantiated
		System.out.println(Vehicle.country);
		//Vehicle.country = "US";
		System.out.println(AppConstants.ServiceUrl);
		MyConstants myConstants = new MyConstants();
		System.out.println(myConstants.getServiceUrl());
		System.out.println(myConstants.ServiceUrl);
		
		
		Vehicle car  = new Car();
		car.start();
		car.stop();
		
		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
		car.register();
		bike.register();
		
		Car ferrari = new Car();
		ferrari.register();
		ferrari.start();
		ferrari.move();
		ferrari.stop();
		
	}

}

//Entity where you can have concrete(default) methods
//Entity where you can have variables (only final)
//Entity where you can have abstract methods (keyword abstract is optional)
//Entity that cannot be instantiated
interface MovingMachine {
	default void move() {}
	static void repair() {}
}
interface Vehicle {
	String country = "India";
	default void register() {
		System.out.println("Register in RTO");
	}
	void start();
	void stop();
}
class Car implements Vehicle, MovingMachine {
	public void start() {}
	public void stop() {}
}
class Bike implements Vehicle, MovingMachine {
	public void start() {}
	public void stop() {}	
}