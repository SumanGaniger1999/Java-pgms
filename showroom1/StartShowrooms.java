package com.xworkz.showroom1;

public class StartShowrooms {
		public static void main(String[] args) throws CloneNotSupportedException {
			Showroom sh=new Showroom();
			sh.setShowRoom("Honda Showroom");
			sh.setLocation("Banglore");
			
			Object obj=sh.clone();
			Showroom shw=(Showroom)obj;
			
			System.out.println(shw.getShowRoom());
			System.out.println(shw.getLocation());
			
			
		}

	}



