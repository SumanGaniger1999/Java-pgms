package com.xworkz.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Area {
public static void main(String[] args) {
	Map<String,Integer> area=new HashMap<String,Integer>();
	area.put("Gayatrinagar",1256);
	area.put("Rajajinagar",4567);
	area.put("Vijyanagar",5678);
	area.put("Basaveshwarnagar",67890);
	area.put("JPnagar",45678);
	area.put("Padmanabhanagar",90876);
	area.put("Banashankari",4567);
	area.put("Uttarahalli",8907);
	area.put("Kumaraswamy",76543);
	area.put("Girinagar",78906);
	area.put("Jayanagar",7880);
	
	Set<Map.Entry<String,Integer>> entry=area.entrySet();
	entry.forEach((s)->System.out.println(s.getKey()));
	
	Set<Map.Entry<String,Integer>> value=area.entrySet();
	value.forEach((r)->System.out.println(r.getValue()));
	
	Set<Map.Entry<String,Integer>> value1=area.entrySet();
	value1.forEach((p)->System.out.println(p.getKey()+" "+p.getValue()));
	
	Set<Map.Entry<String,Integer>> values=area.entrySet();
	Iterator<Map.Entry<String,Integer>> itr=values.iterator();
	  while(itr.hasNext()) {
		  Map.Entry<String,Integer> tmp=itr.next();
		  System.out.println(tmp.getKey());
		  System.out.println(tmp.getValue());
		  
		  
		  
	  } 
		  
		  System.out.println("--------------Descending----------------");
		  Map<String,Integer> areas=new TreeMap<String,Integer>((e1,e2)->(e2.compareTo(e1)));
			areas.put("Gayatrinagar",1256);
			areas.put("Rajajinagar",4567);
			areas.put("Vijyanagar",5678);
			areas.put("Basaveshwarnagar",67890);
			areas.put("JPnagar",45678);
			areas.put("Padmanabhanagar",90876);
			areas.put("Banashankari",4567);
			areas.put("Uttarahalli",8907);
			areas.put("Kumaraswamy",76543);
			areas.put("Girinagar",78906);
			areas.put("Jayanagar",7880);
			
			Set<Map.Entry<String,Integer>> entry1=areas.entrySet();
			entry.forEach((s)->System.out.println(s.getKey()));
			
			Set<Map.Entry<String,Integer>> entry2=areas.entrySet();
			value.forEach((r)->System.out.println(r.getValue()));
			
			Set<Map.Entry<String,Integer>> entry3=areas.entrySet();
			value1.forEach((p)->System.out.println(p.getKey()+" "+p.getValue()));
			
			Set<Map.Entry<String,Integer>> entry4=areas.entrySet();
			Iterator<Map.Entry<String,Integer>> it=values.iterator();
			  while(itr.hasNext()) {
				  Map.Entry<String,Integer> tm=itr.next();
				  System.out.println(tm.getKey());
				  System.out.println(tm.getValue());
		  
				  
				 
				  
			  }
				  
				  Map<String,Integer> ar=new TreeMap<String,Integer>((e1,e2)->(e1.compareTo(e2)));
					ar.put("Gayatrinagar",1256);
					ar.put("Rajajinagar",4567);
					ar.put("Vijyanagar",5678);
					ar.put("Basaveshwarnagar",67890);
					ar.put("JPnagar",45678);
					ar.put("Padmanabhanagar",90876);
					ar.put("Banashankari",4567);
					ar.put("Uttarahalli",8907);
					ar.put("Kumaraswamy",76543);
					ar.put("Girinagar",78906);
					ar.put("Jayanagar",7880);
					 System.out.println("------------------------------");
					
					Set<Map.Entry<String,Integer>> et=ar.entrySet();
					entry.forEach((s)->System.out.println(s.getKey()));
					
					Set<Map.Entry<String,Integer>> et1=ar.entrySet();
					value.forEach((r)->System.out.println(r.getValue()));
					
					Set<Map.Entry<String,Integer>> et2=ar.entrySet();
					value1.forEach((p)->System.out.println(p.getKey()+" "+p.getValue()));
					
					Set<Map.Entry<String,Integer>> et3=ar.entrySet();
					Iterator<Map.Entry<String,Integer>> itrt=values.iterator();
					  while(itr.hasNext()) {
						  Map.Entry<String,Integer> tmpr=itr.next();
						  System.out.println(tmpr.getKey());
						  System.out.println(tmpr.getValue());
				  
	  
	
			  
	
	  }
}
	  }

