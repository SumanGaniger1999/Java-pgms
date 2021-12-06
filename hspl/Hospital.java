package com.xworkz.hspl;

public class Hospital implements Cloneable{
	private String name;
	private int noOfDoctors;
	private int noOfPatients;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfDoctors() {
		return noOfDoctors;
	}
	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
