package com.xworkz.laptop;

public class Laptop implements Cloneable{

	private String name;
	private int cost;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
