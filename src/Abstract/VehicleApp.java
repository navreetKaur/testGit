package Abstract;

public class VehicleApp {
	public static void main(String[] args) {
		Plane plane = new Plane();
		System.out.println(plane.accelerate());
		System.out.println(plane.run());
		System.out.println(plane.stop());
		System.out.println(plane.fly());
		System.out.println("Pilot today is " + plane.getDriver().getName());
		
		Boat boat = new Boat();
		System.out.println(boat.accelerate());
		System.out.println(boat.run());
		System.out.println(boat.stop());
		System.out.println(boat.sail());
		System.out.println("Captain is " + boat.getDriver().getName());
		
		Car car = new Car("Honda Accord");
		System.out.println(car.accelerate());
		System.out.println(car.run());
		System.out.println(car.stop());
		System.out.println(car.setSpeed(100));
		System.out.println(car.getModel() + " is driven by " + car.getDriver().getName());
	}

}
