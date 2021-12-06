package com.xworkz.travels;

public class Travels implements Cloneable{
private String name;
private int noOfBus;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNoOfBus() {
	return noOfBus;
}
public void setNoOfBus(int noOfBus) {
	this.noOfBus = noOfBus;
}

@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
