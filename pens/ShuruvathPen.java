package com.xworkz.pens;

public class ShuruvathPen {
	public static void main(String[] args) throws CloneNotSupportedException {
		Pen pen=new Pen();
		pen.setName("Parker");
		pen.setPrice(362);
		pen.setColor("Blue");
		
		Object obj=pen.clone();
		Pen pen1=(Pen)obj;
		
		System.out.println(pen1.getName());
		System.out.println(pen1.getPrice());
		System.out.println(pen1.getColor());
		
	}

}
