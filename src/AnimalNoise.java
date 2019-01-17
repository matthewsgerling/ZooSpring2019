
import model.*;

public class AnimalNoise {
	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		Dog max = new Dog("Max", 5, "Golden Lab");
		System.out.println(max.speak());
		Bird charlie = new Bird();
		System.out.println(charlie.speak());
		Zebra joe = new Zebra();
		System.out.println(joe.speak());
		Frog Kermit = new Frog("Kermit", 2, "Green");
		System.out.println(Kermit.speak());
		Snake ramses = new Snake("Ramses", "Python", false);
		System.out.println(ramses.speak());
		Lion Mufasa = new Lion("Mufasa", 25, 240);
		System.out.println(Mufasa.speak());
		Cow Babe = new Cow("Babe", "Angus", "Female");
		System.out.println(Babe.speak());
		Goat billy = new Goat("Brown", "M", "Billy");
		System.out.println(billy.speak());
		Turkey Tom = new Turkey("Tom", 3, "Male");
		System.out.println(Tom.speak());
		Sheep shirley = new Sheep("Shirley", "Female", 3);
		System.out.println(shirley.speak());
		Chicken clucky = new Chicken();
		System.out.println(clucky.speak());
		Elephant dumbo = new Elephant("Dumbo", 250, "Male");
		System.out.println(dumbo.speak());
		Weasel slinky = new Weasel("Slinky", 3, 18);
		System.out.println(slinky.speak());
		Turtle dude = new Turtle("dude", "sea", 130);
		System.out.println(dude.speak());
	}

}
