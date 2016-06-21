package Abstract;

public final class Plane extends Vehicle{
	private Person driver = new Pilot("Slytherin");
	

	public Person getDriver() {
		return driver;
	}

	public void setDriver(Person driver) {
		this.driver = driver;
	}

	@Override
	public String run() {
		return ("Plane is running");
		
	}

	@Override
	public String stop() {
		return ("Plane is stopping");
		
	}

	@Override
	public String accelerate() {
		return ("Plane is accelerating");
		
	}
	
	public String fly() {
		return ("Plane is flying");
		
	}

}
