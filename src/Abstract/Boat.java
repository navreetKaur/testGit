package Abstract;

public final class Boat extends Vehicle{

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
