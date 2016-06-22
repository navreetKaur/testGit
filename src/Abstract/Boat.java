package Abstract;

public final class Boat extends Vehicle{
	private Person driver = new Captain("Hufflepuff");
	

	public Person getDriver() {
		return driver;
	}

	public void setDriver(Person driver) {
		this.driver = driver;
	}

	@Override
	public String run() {
		return ("Boat is running");
		
	}

	@Override
	public String stop() {
		return ("Boat is stopping");
		
	}

	@Override
	public String accelerate() {
		return ("Boat is accelerating");
		
	}
	
	public String sail() {
		return ("Boat is sailing");
		
	}

}
