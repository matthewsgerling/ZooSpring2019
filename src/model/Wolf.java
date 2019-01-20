package model;

public class Wolf {
	private String name;
	private String TerritoryRange;
	private String gender;

	public Wolf() {
		super();
	}

	public Wolf(String name, String TerritoryRange, String gender) {
		super();
		this.name = name;
		this.TerritoryRange = TerritoryRange;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTerritoryRange() {
		return TerritoryRange;
	}

	public void setTerritoryRange(String TerritoryRange) {
		this.TerritoryRange = TerritoryRange;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String speak() {
		return "Howl";
	}


}
