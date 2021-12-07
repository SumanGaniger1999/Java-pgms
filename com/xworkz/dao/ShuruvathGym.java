package com.xworkz.gymProject;

public class ShuruvathGym {
	public static void main(String[] args) {
		Gym gy=new Gym();
		
		gy.save("205, 2nd and 3rd floor,Basaveshwar Nagar, Bengaluru, Karnataka 560079");
		gy.save("1861-1862,Mahakavi Kuvempu Rd,Rajajinagar,Bengaluru,Karnataka 560021");
		gy.save("1st floor, Above Ritu Kumar, Indiranagar Double Rd, HAL 2nd Stage, Bengaluru");
		
		boolean found=gy.find("205, 2nd and 3rd floor,Basaveshwar Nagar, Bengaluru, Karnataka 560079");
		System.out.println(found);
		
		 found=gy.findByCaseInSensitive("1861-1862,Mahakavi Kuvempu Rd,Rajajinagar,Bengaluru,Karnataka 560021");
	      System.out.println(found);
	      
	      found=gy.findByCaseInSensitiveAndTrimmed("1861-1862,Mahakavi Kuvempu Rd,Rajajinagar,Bengaluru,Karnataka560021");
	
	     System.out.println(found);
	}
}
