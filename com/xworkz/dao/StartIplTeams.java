package com.xworkz.dao;



public class StartIplTeams {
	public static void main(String[] args) {
		IPL ip=new IPL();
		
		ip.save("Royal Challengers Banglore");
		ip.save("Mumbai Indians");
		ip.save("Rajasthan Royals");
		
		boolean found=ip.find("Royal Challengers Banglore");
		System.out.println(found);
		
		found=ip.findByCaseSensitive("Mumbai Indians");
		System.out.println(found);
		
		found=ip.findByCaseInSensitiveAndTrimmed("Royal Challengers Banglore");
		System.out.println(found);
	}
}



