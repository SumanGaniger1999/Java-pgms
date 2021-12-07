package com.xworkz.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PgDAO {
private Collection<String>  pg=new ArrayList();
	
	
	public boolean create(String pgName) {
		
		return pg.add(pgName);
		
	}
	
	public boolean find(String name) {
		return pg.contains(name);
	}
	
	public boolean findByCaseInSensitive(String name) {
		Iterator<String> itr=pg.iterator();
		while(itr.hasNext()) {
			String tempNo=itr.next();
			if(tempNo.equalsIgnoreCase(name)) {
				return true;
			}
		}
 		return false;
	}
	public boolean findByCaseInSensitiveAndTrimmed(String name) {
		Iterator<String> itr=pg.iterator();
		while(itr.hasNext()) {
			String tempNo=itr.next();
			tempNo=tempNo.replace(" ","");
			if(tempNo.equalsIgnoreCase(name.replace(" ",""))) {
				return true;
			}
		}
 		return false;

}
}



