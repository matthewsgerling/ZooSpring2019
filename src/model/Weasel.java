
package model;

/**
 * @author RYANF This is meant to describe some characteristics of a weasel and then make it speak.
 */
public class Weasel {
	// Variables for Weasel
	private String name;
	private int age;
	private int wieghtInOunces;

	// Constructor
	public Weasel() {
		super();
	}

	// Constructor
	public Weasel(String name, int age, int wieghtInOunces) {
		super();
		this.name = name;
		this.age = age;
		this.wieghtInOunces = wieghtInOunces;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWieghtInOunces() {
		return wieghtInOunces;
	}

	public void setWieghtInOunces(int wieghtInOunces) {
		this.wieghtInOunces = wieghtInOunces;
	}

	// Returns the sound a weasel makes
	public String speak() {
		return "skweeeeek";
	}
}
