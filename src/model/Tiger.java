package model;

public class Tiger 
{
	private String name;
	private String origin;
	private int age;
	
	public Tiger() 
	{
		super();
	}
	
	// Tiger constructor with all the instance variables.
	public Tiger(String name, String origin, int age) 
	{
		super();
		this.name = name;
		this.origin = origin;
		this.age = age;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getOrigin() 
	{
		return origin;
	}
	public void setOrigin(String origin) 
	{
		this.origin = origin;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public String speak() 
	{
		return "Growl~~~";
	}
}