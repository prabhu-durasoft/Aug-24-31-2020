
public class VehicleUser {

	public static void main(String[] args) {
		//Vehicle vehicle = new Vehicle(); //DOES NOT MAKE SENSE
		//vehicle.start();
		
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		car.start();
		bike.start();
	}

}
