package InheritanceAnimals;

public class Bird extends Animal{

	public void eat() {
		super.eat();
		System.out.println("--And bird eats worms");
		
	}

	public void sleep() {
		super.sleep();
		System.out.println("--And bird sleeps during night");
		
	}

	public void fly() {
		super.fly();
		System.out.println("--And Birds fly");
	}

}
