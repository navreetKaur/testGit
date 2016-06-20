package InheritanceAnimals;

public class Cat extends Animal{

	public void eat() {
		super.eat();
		System.out.println("--And cat eats rats");
		
	}

	public void sleep() {
		super.sleep();
		System.out.println("--And cat sleeps in night");
		
	}
	@Override
	public String toString() {
		return("My Kitty name is Mr. Puss");
	}
	
	@Override
	public boolean equals(Object o) {
		return false;
	}
	

}
