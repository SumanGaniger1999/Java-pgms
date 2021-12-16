package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Aadhar {
public static void main(String[] args) {
	Map<String,Long> map=new HashMap();
	map.put("Suman",418100306025l);
	map.put("Tappu",1342123456789l);
	map.put("Shweta",1345678909874l);
	map.put("Soujanaya",4356212345567l);
	
	Long value=map.get("Suman");
	System.out.println(value);
	
	Set<String> keys=map.keySet();
	System.out.println(keys);
	
	
	
	
	
	
	
	
	
}
}
