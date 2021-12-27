package com.xworkz.jar;

public class Jar {
public static void main(String[] args) {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("jdbc created");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
