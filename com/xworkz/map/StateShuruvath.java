package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StateShuruvath {
	public static void main(String[] args) {
		
		Map<String,Integer> state=new HashMap<String,Integer>();
		
		 state.put("Karnataka",30);
		 state.put("Gujarat",33);
		 state.put("Haryana",22);
		 state.put("Himachal Pradesh",12);
		 state.put("Madhya Pradesh",52);
		 state.put("Nagaland",11);
		 state.put("Punjab",22);
		 state.put("Rajasthan",33);
		 state.put("Sikkim",4);
		 state.put("Tripura",8);
		 
		 Set<Map.Entry<String,Integer>>  entrySet=state.entrySet();
		 entrySet.forEach((entry)->System.out.println(entry.getKey()));
		 
		 Set<Map.Entry<String,Integer>> entry=state.entrySet();
		 entry.forEach((enter)->System.out.println(enter.getValue()));
		 
		 Set<Map.Entry<String,Integer>> values=state.entrySet();
		 values.forEach((value)->System.out.println(value.getKey()+ " "+value.getValue()));
		 
		 
		 
		 System.out.println("--------------------Ascending order------------------------");
		 Map<String,Integer> states=new TreeMap<String,Integer>((e1,e2)->e1.compareTo(e2));
			
		 state.put("Karnataka",30);
		 state.put("Gujarat",33);
		 state.put("Haryana",22);
		 state.put("Himachal Pradesh",12);
		 state.put("Madhya Pradesh",52);
		 state.put("Nagaland",11);
		 state.put("Punjab",22);
		 state.put("Rajasthan",33);
		 state.put("Sikkim",4);
		 state.put("Tripura",8);
		 
		 Set<Map.Entry<String,Integer>>  entrySet1=states.entrySet();
		 entrySet.forEach((entry1)->System.out.println(entry1.getKey()));
		 
		 Set<Map.Entry<String,Integer>> entry2=states.entrySet();
		 entry.forEach((enter2)->System.out.println(enter2.getValue()));
		 
		 Set<Map.Entry<String,Integer>> values1=state.entrySet();
		 values.forEach((value1)->System.out.println(value1.getKey()+ " "+value1.getValue()));
		 
		 
		 Map<String,Integer> state1=new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
			
		 state1.put("Karnataka",30);
		 state1.put("Gujarat",33);
		 state1.put("Haryana",22);
		 state1.put("Himachal Pradesh",12);
		 state1.put("Madhya Pradesh",52);
		 state1.put("Nagaland",11);
		 state1.put("Punjab",22);
		 state1.put("Rajasthan",33);
		 state1.put("Sikkim",4);
		 state1.put("Tripura",8);
		 
		 System.out.println("--------------Descending order----------------");
		 Set<Map.Entry<String,Integer>>  entrySet2=state1.entrySet();
		 entrySet1.forEach((entry1)->System.out.println(entry1.getKey()));
		 
		 Set<Map.Entry<String,Integer>> entry3=state1.entrySet();
		 entry.forEach((enter)->System.out.println(enter.getValue()));
		 
		 Set<Map.Entry<String,Integer>> values2=state1.entrySet();
		 values.forEach((value)->System.out.println(value.getKey()+ " "+value.getValue()));
		 
		 
	        	
	}

}
