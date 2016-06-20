package Abstract;

public final class Plane extends Vehicle{

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
