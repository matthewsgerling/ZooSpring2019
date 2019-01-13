package model;
//Don Erickson

public class Llama {

	//three instance vars
	private String name;
	private String nickname;
	private String activity;
	
	//that default constructor 
	public Llama() {
		super();
	}
	
	//constructor with love for variables
	public Llama(String name, String nickname, String activity) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.activity = activity;
	}
	
	//generating those getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	//method returning string about the noises tina makes
	public String speak() {
		return "huuuuuuuuuuuuuuuuuuugh";
	}
	
}
