package com.xworkz.hospitalapp.dto;

public class DistrictDTO {
	
	public DistrictDTO() {
		System.out.println("District object is created");
	}
	
	private int districtId;
	private String districtName;
	private AreaDTO area;
	
	
	public void setDistrictId(int districtId) {
		  this.districtId=districtId;
	  }
	  
	  public int getDistrictId() {
		  return districtId;
	  }
	  
	  public void setDistrictName(String districtName) {
		  this.districtName=districtName;
	  }
	  public String getDistrictName() {
		  return districtName;
	  }
	  public void setArea(AreaDTO area) {
		  this.area =area;
	  }
	  
	  public AreaDTO getArea() {
		  return area;
	  }
	  @Override 
    public String toString() {
    	return"DistrictDTO---{DistrictId="+districtId+",DistrictName="+districtName+",Area="+area+"}";
    }
}
