//Made by: Noah Schumacher
package model;

public class Turtle {

	private String name;
	private String type;//box, snapping, or sea can produce different sounds
	private int age;
	private String B = "box", S = "snapping", C = "sea";
	
	public Turtle() {
		super();
	}
	
	public Turtle(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak() {
		if (this.type == B) {
			return "hiss hiss";
		}else if (this.type == S) {
			return "chomp! Snap!";
		}else if (this.type == C) {
			return "vroommmmmmmm"; // I was told based off of a Quara entry that Sea turtles make jet engine likes sounds, so thats what this is
		} else {
			return "hiss";
		}
	}

	
}
