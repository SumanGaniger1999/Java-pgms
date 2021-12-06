package com.xworkz.institute;

public class ShuruvathQspyder {
	public static void main(String[] args) throws CloneNotSupportedException {
	 Institute ins=new Institute();
		ins.setName("Qspyder");
		ins.setCost(34000);
		
		Object obj=ins.clone();
		Institute in=(Institute)obj;
		
		System.out.println(in.getName());
		System.out.println(in.getCost());
	}

}
