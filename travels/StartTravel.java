package com.xworkz.travels;

public class StartTravel {
	public static void main(String[] args) throws CloneNotSupportedException {
		Travels tr=new Travels();
        tr.setName("Vrl Travels");
        tr.setNoOfBus(34);
        
        
        Object obj=tr.clone();
        Travels trv=(Travels)obj;
        System.out.println(trv.getName());
        System.out.println(trv.getNoOfBus());
}
}