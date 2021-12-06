package com.xworkz.institute;

public class Institute implements Cloneable{
	
	
	private String name;
	private int cost;
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
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
