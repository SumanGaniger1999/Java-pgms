package com.xworkz.functionalInterface;

public class FindCom implements Email{
	public boolean check(String arg1, String arg2) {
		// TODO Auto-generated method stub
		
		String temp=arg1.substring(arg1.length()-4,arg1.length());
		if(temp.equalsIgnoreCase(arg2)) {
		return true;
	}
	
      return false;
}
}
