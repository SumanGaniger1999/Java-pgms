package com.xworkz.laptop;

public class Shuruvath {
public static void main(String[] args) throws CloneNotSupportedException {
	Laptop lp= new Laptop();
	
	lp.setName("Hp");
	lp.setCost(38000);
	lp.setColor("Grey");
	
	Object obj=lp.clone();
	
	Laptop lp1=(Laptop)obj;
    System.out.println(lp1.getName());
    System.out.println(lp1.getCost());
    System.out.println(lp1.getColor());
		
	
}
}
