//Ben Lutgens
package model;

public class Elephant {

	// 3 instance variables
	private String name;
	private int weight;
	private String gender;

	// Default constructor
	public Elephant() {
		super();
	}

	public Elephant(String name, int weight, String gender) {
		super();
		this.name = name;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String speak() {
		return "*Trumpets*";
	}

}
