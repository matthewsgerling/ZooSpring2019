/* Created by Kelsi Jurik
 * DMACC, CIS 175 Java II
 * January 8, 2019
 */

package model;

public class Frog {
	
	// Frog instance variables
	private String name;
	private int age;
	private String color;
	
	// Default Frog constructor
	public Frog() {
		super();
	}
	
	// Frog constructor with 3 instance variables
	public Frog(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	// name getters and setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	// age getters and setters
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// color getter and setters
	public String getColor() {
		return color;
	}
	
	public void setBreed(String color) {
		this.color = color;
	}
	
	// Frog speak method
	public String speak() {
		return "Croooooooooak";
	}
}
