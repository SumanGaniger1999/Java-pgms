package com.xworkz.functionalInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmailDAO {
	
	private Collection<String> ml=new ArrayList();
	
	
	public boolean create(String mail) {
		
		return ml.add(mail);
	}
	
	public boolean find(Email mail,String str ) {
		Iterator<String> itr=ml.iterator();
		while (itr.hasNext()) {
			String type =  itr.next();
			if(mail.check(type,str)) {
				return true;
			}
			
		}
		return false;
		
	}
	
	 
	

}
