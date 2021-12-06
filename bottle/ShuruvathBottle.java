package com.xworkz.bottle;

public class ShuruvathBottle {
	public static void main(String[] args) throws CloneNotSupportedException {
		Bottle btl=new Bottle();
		btl.setName("KingFisher");
		btl.setCost(45);
		btl.setColor("Red");
		
		Object obj=btl.clone();
		
		Bottle btl1= (Bottle)obj;
		System.out.println(btl1.getName());
		System.out.println(btl1.getCost());
		System.out.println(btl1.getColor());
       		
	}

}
