
import model.*;


public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		Dog max = new Dog("Max", 5, "Golden Lab");
		System.out.println("My dog's name is " + max.getName());
		System.out.println("His age is " + max.getAge());
		System.out.println("He is a " + max.getBreed());
		System.out.println(max.speak());
	
   
   
   	}

}

