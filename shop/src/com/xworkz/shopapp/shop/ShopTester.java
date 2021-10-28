package com.xworkz.shopapp.shop;

import java.util.Scanner;


import com.xworkz.shopapp.dto.ElectronicsGadgetsDTO;

public class ShopTester {
	
	public static void main(String a[]) {
		
		System.out.println("\n"+"Enter the number of electronics ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Shop shop=new Shop(size);
		
		if(size>0) {
			for(int i=0;i<size;i++) {
				ElectronicsGadgetsDTO elec=new ElectronicsGadgetsDTO();
				
				System.out.println("Enter Details");
				
				System.out.println("Enter ElectronicsId");
				int electronicsId=sc.nextInt();
				elec.setElectronicId(electronicsId);
				System.out.println("Enter ElectronicsName");
				String electronicsName=sc.next();
				elec.setElectronicName(electronicsName);
				System.out.println("Enter ElectronicsPrice");
				double electronicsPrice=sc.nextDouble();
				elec.setElectronicPrice(electronicsPrice);
				
				boolean isAdded=shop.addElectronicsDetails(elec);
				System.out.println("ElectronicsAdded:"+isAdded);
			}
				
				shop.getElectronicsDetails();
				System.out.println("\n"+"Enter the ElectronicsId");
				int electronicId=sc.nextInt();
				System.out.println(shop.getElectronicsById(electronicId));
				
			   System.out.println("\n"+"Enter the ElectronicsName");
			   String electronicName=sc.next();
			   System.out.println(shop.getElectronicsName(electronicName));
			   
			   System.out.println("\n"+"Enter the ElectronicsPrice");
			   double electronicPrice=sc.nextDouble();
			   System.out.println(shop.getElectronicsPrice(electronicPrice));
			   
			   int choice;
				String text;
				do {
				System.out.println("Press 1 to get all electronics ");	
				System.out.println("Press 2 to get Electronics Name");
				System.out.println("Press 3 to get Electronics Id");
				System.out.println("Enter your choice :-");
				choice=sc.nextInt();
				
				 
		              
			
			switch(choice) {
			case 1: shop.getElectronicsDetails();
			  break;
			  
			case 2:System.out.println("Enter the electronic Name");
			ElectronicsGadgetsDTO dto1=shop.getElectronicsName(sc.next());
			    	 if(dto1!=null) {
			    		 System.out.println(dto1);
			    		 
			    	 }
			    	 else {
			    		 System.out.println("No electronic found by Name");
			    	 }
			    	 break;
			case 3:System.out.println("Enter the electronic Id");
			ElectronicsGadgetsDTO dto2=shop.getElectronicsById(sc.nextInt());
			       if(dto2!=null) {
			    	   System.out.println(dto2);
			       }
			       else {
			    	   System.out.println("No electronic found by Id");
			       }
			       
			       default:
			    	 System.out.println("invalid Choice");
			}
			       System.out.println("do want continue press y/n");
			       text=sc.next();
			       
			}  
			       while(text.equals("y"));
			    //System.out.println(getElectronicName(sc.next());	
			   
			}
		
		
		
		System.out.println("\n"+"Enter electronicId and electronicPrice to be updated");
		int id=sc.nextInt();
		double price=sc.nextDouble();
		shop.updateElectronicsPriceById(price, id);
		
		shop.getElectronicsDetails();
		System.out.println("\n"+"Enter id to be deleted");
		int id1=sc.nextInt();
		shop.deleteElectronicsById(id1);
		
	}

}
