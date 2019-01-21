/**
 * 
 */
package model;

/**
 * @author Jeffery Decker
 *
 */
public class Goat {
	// Fields
	private String color;
	private String gender;
	private String name;
	
	// Constructors
	public Goat() {
	}

	// constructor with 3 instance variables
	public Goat(String color, String gender, String name) {
		this.color = color;
		this.gender = gender;
		this.name = name;
	}

	// Getters and setters
	public String getColor() {
		return color;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// speak method
	public String speak() {
		return "Baaa!";
	}
	
}
