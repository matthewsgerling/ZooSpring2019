// A J Abrahamsen

package model;

public class Horse {
	// Three instance variables.
	private String name;
	private String color;
	private String breed;
	
	// Default Horse constructor.
	public Horse() 
	{
		super();
	}
	
	// Horse constructor with instance variables.
	public Horse(String name, String color, String breed) 
	{
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
	}
	
	// Getters and setters for Name.
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	// Getters and setters for Color.
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	// Getters and setters for Breed.
	public String getBreed() 
	{
		return breed;
	}
	
	public void setBreed(String breed) 
	{
		this.breed = breed;
	}
	
	// Speak method that outputs a horse sound.
	public String speak() 
	{
		return "Neigh";
	}
}
