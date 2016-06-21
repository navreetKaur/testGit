package Abstract;

public final class Car extends Vehicle{
	private String model;
	private Person driver = new Driver("Dobby");	
	
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Person getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

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
