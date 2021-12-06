package com.xworkz.canteen;

public class Canteen implements Cloneable{
	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
