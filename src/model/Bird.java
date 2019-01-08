// Created by Benjamin Frederickson
// bfrederickson@dmacc.edu
// 1/7/2019

package model;

public class Bird 
{
	// Create Three instance variables.
	private String name;
	private String color;
	private String breed;
	
	// Default constructor.
	public Bird() 
	{
		super();
	}
	
	// Bird constructor with all the instance variables.
	public Bird(String name, String color, String breed) 
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
	
	// Speak method that outputs the bird's sound.
	public String speak() 
	{
		return "Chirp";
	}
}