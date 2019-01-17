package model;

public class Chicken {

    private String name;
    private char gender;
    private String color;

    public Chicken() {
    }

    public Chicken(String name, char gender, String color) {
        this.name = name;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String speak(){
        return "Bacawk!";
    }
}
