package model;

public class Fox {
	// Spencer Davis
		
	// 3 instance variables
	private String name;
	private String color;
	private String gender;
	
	// Constructors
	public Fox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fox(String name, String color, String gender) {
		super();
		this.name = name;
		this.color = color;
		this.gender = gender;
	}
	
	// Getters + Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	// What does the fox say!?
		public String speak() {
			return  "Ring-ding-ding-ding-dingeringeding! "
				+ 	"Gering-ding-ding-ding-dingeringeding! "
				+ 	"Gering-ding-ding-ding-dingeringeding!";
		}

}
