package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;

public class Continents {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap();
		map.put("Africa",54 );
		map.put("Asia",48 );
		map.put("Europe ",44 );
		map.put("North America",23 );
		map.put("Australia",14 );
		
		System.out.println(map.size());
		
		
		Integer value= map.get("Africa");
		System.out.println(value);
		
	    Integer	values=map.remove(54);
		System.out.println(values);
		
		boolean keys=map.containsValue(54);
		System.out.println(keys);
		
		boolean key=map.containsKey("Africa");
		System.out.println(key);
		
		
		
	}

}
