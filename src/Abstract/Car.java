package Abstract;

public final class Car extends Vehicle{
	private String model;
	
	public Car() {
		model = "Honda Civic";
	}
	
	public Car(String model) {
		this.model = model;
	}

	@Override
	public String run() {
		return (model + " is running");
		
	}

	@Override
	public String stop() {
		return (model + " is stopping");
		
	}

	@Override
	public String accelerate() {
		return (model + " is accelerating");
		
	}
	
	public String setSpeed(double speed) {
		return "The Speed is "+ speed +" mph";
	}

}
