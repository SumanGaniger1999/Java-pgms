package com.xworkz.canteen;

public class StartCanteen {
	public static void main(String[] args) throws CloneNotSupportedException {
		Canteen can=new Canteen();
		can.setName("Virana Mirchi");
		can.setLocation("Banglore");
		
		Object obj=can.clone();
		Canteen ct=(Canteen)obj;
		System.out.println(ct.getName());
		System.out.println(ct.getLocation());
		
	}

}
