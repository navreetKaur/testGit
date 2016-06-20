package Abstract;

public final class Plane extends Vehicle{

	@Override
	public void run() {
		System.out.println("Plane is running");
		
	}

	@Override
	public void stop() {
		System.out.println("Plane is stopping");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Plane is accelerating");
		
	}
	
	public void fly() {
		System.out.println("Plane is flying");
		
	}

}
