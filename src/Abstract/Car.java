package Abstract;

public final class Car extends Vehicle{
	private String model;
	
	public Car(String model) {
		this.model = model;
	}

	@Override
	public void run() {
		System.out.println(model + " is running");
		
	}

	@Override
	public void stop() {
		System.out.println(model + " is stopping");
		
	}

	@Override
	public void accelerate() {
		System.out.println(model + " is accelerating");
		
	}

}
