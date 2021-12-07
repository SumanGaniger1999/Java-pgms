package com.xworkz.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IPL {
	private Collection<String> ipl=new ArrayList();

	public boolean save(String iplTeams) {
		
		return ipl.add(iplTeams);
		
	}
	public boolean find(String iplTeams) {
		
		return ipl.contains(iplTeams);
		
	}
	public boolean findByCaseSensitive(String iplTeams){
		Iterator<String> itr=ipl.iterator();
		while(itr.hasNext()) {
			String tempNo=itr.next();
			if(tempNo.equals(iplTeams)) {
				 return true;
			}
			
			
		}
		return false;
	}
	public boolean findByCaseInSensitiveAndTrimmed(String iplTeams) {
		Iterator<String> itr=ipl.iterator();
		while(itr.hasNext()) {
			String tempNo=itr.next();
			tempNo=tempNo.replace(" ","");
			if(tempNo.equalsIgnoreCase(iplTeams.replace(" ", ""))) {
				return true;
			}
		}
		return false;
	}
	}



