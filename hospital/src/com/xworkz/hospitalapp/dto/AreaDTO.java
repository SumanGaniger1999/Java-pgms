package com.xworkz.hospitalapp.dto;

public class AreaDTO {
	
	public AreaDTO() {
		System.out.println("Area object is created");
	}

	  private int areaId;
	  private String areaName;
	  private StreetDTO street;
	  
	  
	  public void setAreaId(int areaId) {
		  this.areaId=areaId;
	  }
	  
	  public int getAreaId() {
		  return areaId;
	  }
	  
	  public void setAreaName(String areaName) {
		  this.areaName=areaName;
	  }
	  public String getAreaName() {
		  return areaName;
	  }
	  public void setStreet(StreetDTO street) {
		  this.street=street;
		  
	  }
	  public StreetDTO getStreet() {
		  return street;
	  }
	  @Override 
	  public String toString() {
		  return"AreaDTO---{AreaId="+areaId+",AreaName="+areaName+",Street="+street+"}";
	  }
}
