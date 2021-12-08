package com.xworkz.functionalInterface;

public class EmailTester {
public static void main(String args[]) {
		
		EmailDAO dao=new EmailDAO();
		
		dao.create("sumanganiger@gmail.com");
		dao.create("smita@gmail.com");
		dao.create("shweta@gamil.in");
		
	 
	       Email ml1=new FindCom();
	       System.out.println(dao.find(ml1,".com"));
	       
	       
	       Email email=new FindIn();
	       System.out.println(dao.find(email,".in"));
	       
	       Email  mal=new FindMatch();
	       System.out.println(dao.find(mal,"sumanganiger@gmail.com"));
		
		

		
		
		
	}

}
