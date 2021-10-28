package com.xworkz.shopapp.dto;

public class ElectronicsGadgetsDTO {
	
	public ElectronicsGadgetsDTO () {
		
		System.out.println("Electronics object is created");
	}
	
	private  int electronicId;
	private String electronicName;
    private double electronicPrice;
    
    
    
    public void setElectronicId(int electronicId) {
    	this.electronicId=electronicId;
    }
    
    public int getElectronicId() {
    	return electronicId;
    }
    
    public void setElectronicName(String electronicName ) {
    	this.electronicName=electronicName;
    }
    public String getElectronicName() {
    	return electronicName;
    }
    public void setElectronicPrice(double electronicPrice) {
    	this.electronicPrice=electronicPrice;
    }
    
    public double getElectronicPrice() {
    	return electronicPrice;
    }
    
    @Override
    public String toString() {
    	return"ElectronicGadgetsDTO----{Id="+electronicId+",Name="+electronicName+",Price="+electronicPrice+"}";
    }
}
