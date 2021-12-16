package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Planet {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap();
		map.put("Earth",1);
		map.put("Mars",2);
		map.put("Jupiter",53);
		map.put("Saturn",55);
		
		Integer value=map.get("Earth");
		System.out.println(value);
		
		System.out.println(map.size());
		
		
		//Integer values=map.remove("Saturn");
		//System.out.println(values);
		
		
		map.putAll(map);
		System.out.println(map);
		
		Set<Entry<String,Integer>> value1=map.entrySet();
		System.out.println(value1);
		
	}

}
