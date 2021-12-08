package com.xworkz.functionalInterface;

public class FindIn implements Email {

	@Override
	public boolean check(String arg1, String arg2) {
		// TODO Auto-generated method stub
		String s=arg1.substring(arg1.length()-3,arg1.length());
		if(s.equalsIgnoreCase(arg2)) {
		// TODO Auto-generated method stub
		return true;
		
	}
		return false;
}
	
}