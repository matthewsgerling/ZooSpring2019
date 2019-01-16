package model;

public class Snake {
	
	private String name;
	private String breed;
	private boolean isVenomous;
	
	public Snake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snake(String name, String breed, boolean isVenomous) {
		super();
		name = getName();
		breed = getBreed();
		isVenomous = isVenomous();
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

	public boolean isVenomous() {
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous) {
		this.isVenomous = isVenomous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", breed=" + breed + ", isVenomous=" + isVenomous + "]";
	}
	
	public String speak() {
		return "Hissssssss";
	}
	
}
