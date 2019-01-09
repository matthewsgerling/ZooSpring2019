package model;

public class Zebra {
	private String name;
	private int stripes;
	private int age;
	
	
	public Zebra() {
		super();
	}
	
	
	public Zebra(String name, int stripes, int age) {
		super();
		this.name = name;
		this.stripes = stripes;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStripes() {
		return stripes;
	}
	public void setStripes(int stripes) {
		this.stripes = stripes;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String speak() {
		return "Bark bark yip";
	}

}
