public class Car {
	
	//Method overloading or Function overloading
	public void drive() {
		System.out.println("Driving slow");
	}

	public void drive(int speed) {
		System.out.println("Driving at a speed of " + speed + " kmph");
	}
	
	public void drive(double speed) {
		System.out.println("Driving at a speed of " + speed + " kmph");
	}
	
	public void drive(String model) {
		System.out.println("Driving " + model);
	}
	
	public void drive(int speed, int gear) {
		System.out.println("Driving in  gear: " + gear + " at a speed of " + speed + " kmph");
	}
	
	/*
	public void driveSlow() {
		System.out.println("Driving slow");
	}
	public void driveFast(int speed) {
		System.out.println("Driving at a speed of " + speed + " kmph");
	}
	*/
	
}
