package InheritanceAnimals;

public class AnimalApp {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.eat();
		a.sleep();

		Cat c = new Cat();
		c.eat();
		c.sleep();
		System.out.println(c.toString());
		c.equals(c);

		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();

	}

}
