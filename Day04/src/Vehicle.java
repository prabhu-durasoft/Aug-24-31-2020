//Abstract classes represent a category or group 
//Abstract classes are like normal classes
//Can have variables, methods, constructors
//Can extend other classes
//Can have abstract methods

//YOU CANNOT INSTANTIATE abstract classes
abstract public class Vehicle {
	private String chassisNo;
	public Vehicle() {
	}
	public String getChassisNo() {
		return chassisNo;
	}
	abstract public void start();
	abstract public void stop();
}

abstract class Truck extends Vehicle {
	
}

class Car extends Vehicle {
	public void start() {
		System.out.println("Turn ignition on");
	}

	public void stop() {
		System.out.println("Turn ignition off");
	}
}

class Bike extends Vehicle {

	public void start() {
		System.out.println("Kick start");
	}

	public void stop() {
		System.out.println("Turn ignition off");
	}
	
}

