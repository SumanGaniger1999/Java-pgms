package com.xworkz.functionalInterface;

public class FindMatch implements Email{

	@Override
	public boolean check(String arg1, String arg2) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(arg1.contains(arg2)) {
				return true;
				}
		return false;
	}

}
