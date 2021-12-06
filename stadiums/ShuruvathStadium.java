package com.xworkz.stadiums;

public class ShuruvathStadium {
	public static void main(String[] args) throws CloneNotSupportedException {
		Stadium st=new Stadium();
		st.setLocation("Gujarat");
		st.setName("Narendra Modi");
		
		
		Object obj=st.clone();
		Stadium st1=(Stadium)obj;
		
		System.out.println(st1.getLocation());
		System.out.print(st1.getName());
	}

}
