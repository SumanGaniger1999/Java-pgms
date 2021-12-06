package com.xworkz.mbl;

public class Start {
public static void main(String[] args) throws CloneNotSupportedException {
	Mobiles mbl=new Mobiles();
	mbl.setName("Honor7x");
	mbl.setCost(15500);
	
	Object obj=mbl.clone();
	Mobiles mbl1=(Mobiles)obj;
	
	System.out.println(mbl1.getName());
	System.out.println(mbl1.getCost());
	
	
	
}
}
