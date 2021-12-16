package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Laptop {
public static void main(String[] args) {
	Map<String,Integer> map=new HashMap();
	map.put("hp",210332);
	map.put("dell",34982);
	map.put("lenovo",904563);
	map.put("Infinix",675848);
	
	boolean values=map.containsValue(34982);
	System.out.println(values);
	values=map.containsKey("hp");
	System.out.println(values);
	
	map.putAll(map);
	System.out.println(map);
	
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
		System.out.println(e);
		
	});
	
}
}
