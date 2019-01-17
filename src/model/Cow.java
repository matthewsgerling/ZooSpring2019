package model;

public class Cow {

	private String name;
	private String breed;
	private String gender;

	public Cow() {
		super();
	}

	public Cow(String name, String breed, String gender) {
		super();
		this.name = name;
		this.breed = breed;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String speak() {
		return "MOOOOOOOOO!";
	}

}
