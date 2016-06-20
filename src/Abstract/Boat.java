package Abstract;

public final class Boat extends Vehicle{

	@Override
	public void run() {
		System.out.println("Boat is running");
		
	}

	@Override
	public void stop() {
		System.out.println("Boat is stopping");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Boat is accelerating");
		
	}
	
	public void sail() {
		System.out.println("Boat is sailing");
		
	}

}
