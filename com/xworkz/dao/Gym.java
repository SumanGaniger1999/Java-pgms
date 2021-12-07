package com.xworkz.gymProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Gym {
	private Collection<String> gym=new ArrayList();
	
	public boolean save(String location) {
		return gym.add(location);
	}
	
	public boolean find(String location) {
		
		return gym.contains(location);
	}
	
	public boolean findByCaseInSensitive(String location) {
		Iterator<String> itr=gym.iterator();
		while(itr.hasNext()) {
			String tempNo=itr.next();
			if(tempNo.equals(location)) {
				return true;
			}
		}
			return false;
		
		
	}
	
	public boolean findByCaseInSensitiveAndTrimmed(String location) {
		Iterator<String> itr=gym.iterator();
		while(itr.hasNext()) {
			String tempNo=itr.next();
			tempNo=tempNo.replace("  ","");
			if(tempNo.equalsIgnoreCase(location.replace(" ",""))) {
				return true;
			}
		}
		return false;
	}

}
