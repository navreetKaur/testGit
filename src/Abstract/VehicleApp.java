package Abstract;

public class VehicleApp {
	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.accelerate();
		plane.run();
		plane.stop();
		plane.fly();
		
		Boat boat = new Boat();
		boat.accelerate();
		boat.run();
		boat.stop();
		boat.sail();
		
		Car car = new Car("Honda Accord");
		car.accelerate();
		car.run();
		car.stop();
	}

}
