package com.xworkz.shopapp.shop;

import com.xworkz.shopapp.dto.ElectronicsGadgetsDTO;

public class Shop {
	
	public ElectronicsGadgetsDTO[] electronics;
	private int index;
	
	
	
	public Shop(int size) {
		electronics =new ElectronicsGadgetsDTO[size];
		
	}
	
	public boolean addElectronicsDetails(ElectronicsGadgetsDTO electronics) {
		boolean electronicAdded=false;
		System.out.println("inside add ElectronicsDetails()");
		if(electronics!=null) {
			this.electronics[index++]=electronics;
			 electronicAdded=true;
			
			}
		else {
			System.out.println("No electronics added ");
			return electronicAdded=false;
		}
		    return electronicAdded=true;
		
	}
	
	public void getElectronicsDetails() {
		for(int i=0;i<electronics.length;i++) {
			System.out.print(electronics[i]);
		}
	}
	public ElectronicsGadgetsDTO getElectronicsById(int electronicsId) {
		ElectronicsGadgetsDTO electronicsDTO=null;
			System.out.println("inside electronics getElectronicsById()");
			if(electronicsId>0) {
				for(int i=0;i<electronics.length;i++) {
					if(electronics[i].getElectronicId()==(electronicsId)) {
					System.out.println("Id found by:"+electronicsId);
					electronicsDTO=electronics[i];
				}
					else {
						System.out.println("Id Not found:"+electronicsId);
					}
			}
			
		
	}
			return electronicsDTO;

}
   public ElectronicsGadgetsDTO getElectronicsName(String electronicsName) {
	   ElectronicsGadgetsDTO electronicsDTO=null;
	   System.out.println("inside electronics getElectronicsName()");
	   if(electronicsName!=null) {
		   for(int i=0;i<electronics.length;i++) {
			   if(electronics[i].getElectronicName().equals(electronicsName)) {
				   System.out.println("Name found by:"+electronicsName);
				   electronicsDTO=electronics[i];
			   }
			   else {
				   System.out.println("Name not found by:"+electronicsName);
			   }
		   }
	   }
	   return electronicsDTO;
	   
   }
   public ElectronicsGadgetsDTO getElectronicsPrice(double electronicsPrice) {
	   ElectronicsGadgetsDTO electronicsDTO=null;
	   System.out.println("inside electronics getElectronicsId()");
	   if(electronicsPrice>0.0d) {
		   for(int i=0;i<electronics.length;i++) {
			   if(electronics[i].getElectronicPrice()==electronicsPrice) {
				   System.out.println("Price found by :"+electronicsPrice);
				   electronicsDTO=electronics[i];
			   }
			   else {
				   System.out.println("Price found by:"+electronicsPrice);
			   }
			   
			   }
		   }
	   return electronicsDTO;
	   }
   
   public void updateElectronicsPriceById(double electronicsPrice,int electronicsId) {
	   System.out.println("inside electronics updateElectronicsPriceById()");
	   if(electronicsPrice>0.0d && electronicsId>0) {
		   for(int i=0;i<electronics.length;i++) {
			   if(electronics[i].getElectronicPrice()==electronicsPrice) {
				   System.out.println("Electronics price updated by:"+electronicsPrice);
				   electronics[i].setElectronicId(electronicsId);
			   }
			   else {
				   System.out.println("Electronics is not updated");
			   }
		   }
	   }
   
   }
   
	   public void deleteElectronicsById(int electronicsId) {
		   System.out.println("Inside deleteElectronicsById()");
		if(electronicsId>0) {
			  for(int i=0;i<electronics.length;i++) {
				  if(electronics[i].getElectronicId()==electronicsId) {
					  System.out.println("Electronics id deleted by:"+electronicsId);
					  electronics[i].setElectronicId(electronicsId);
				  
				 }
				  else {
					  System.out.println("Patient is not deleted");
				  }
			  }
			   
		   }
	   }
   }