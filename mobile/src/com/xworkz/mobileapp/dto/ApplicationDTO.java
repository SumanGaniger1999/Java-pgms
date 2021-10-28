package com.xworkz.mobileapp.dto;

public class ApplicationDTO {

	public ApplicationDTO() {
		System.out.println("Mobile object is created");
	}
	
	private int applicationId;
	private String applicationName;
	

	public void setApplicationId(int applicationId) {
		this.applicationId=applicationId;
	}
	
	public int getApplicationId() {
		
		return applicationId;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName=applicationName;
		
	}
	public String getApplicationName() {
		
           return applicationName;
	
	}
	@Override
	public String toString() {
	return"ApplicationDTO---{Id="+applicationId+",Name="+applicationName+"}";
			
	}
	
}

