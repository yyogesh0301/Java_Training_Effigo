
package OOPs;

//Abstract class Creatures
abstract class Creatures {

	abstract void printInfo();

	public void eat() {
		System.out.println("Creatures Eats");
	}
}

//Animal class inherits the Creatures class
class Animal extends Creatures {
	protected String name;
	protected int age;
	protected String color;

	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
		// System.out.println("This is Animal Class ");
	}

	public void printInfo() {
		System.out.println("Animal details- \n" + "Name :" + name + "\nAge:" + age + "\nColor:" + color);
	}

	public void run() {
		System.out.println("Animal runs ");
	}
}

//Dog class inherits from Animal
class Dog extends Animal {
	private String breed;

	public Dog(String name, int age, String color, String breed) {
		super(name, age, color); // Calling superclass constructor
		this.breed = breed;
		System.out.println("This is Dog Class \n");
	}

	// overriding the parent class printInfo - Method Overriding(Runtime
	// Polymorphism)
	@Override
	public void printInfo() {
		System.out.println("Dog's details- \n" + "Name :" + name + "\nAge:" + age + "\nColor:" + color + "\nBreed:"
				+ breed + "\n");
	}

	public void bark() {
		System.out.println("Dog barks \n");
	}
}

//Cat class inherits from Animal 
class Cat extends Animal {
	private String breed;

	public Cat(String name, int age, String color, String breed) {
		super(name, age, color); // Calling superclass constructor
		this.breed = breed;
		System.out.println("This is Cat Class \n");
	}

	@Override
	public void printInfo() {
		System.out.println("Cat's details- \n" + "Name :" + name + "\nAge:" + age + "\nColor:" + color + "\nBreed:"
				+ breed + "\n");
	}

	public void meow() {
		System.out.println("Cat meows");
	}
}

public class Oops_test {

	public static void main(String args[]) {
		Dog d1 = new Dog("rocky", 5, "brown", "pitbull");
		d1.printInfo();
		d1.bark();

		Cat c1 = new Cat("caty", 3, "white", "Persian");
		c1.printInfo();
		c1.meow();

		d1.eat();
		c1.eat();
		d1.run();
	}
}
