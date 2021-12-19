package com.xworkz.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MonthsStart {
	public static void main(String[] args) {
		Map<String,Integer> month=new HashMap<String,Integer>();
		month.put("January",31);
		month.put("Febrauary",28);
		month.put("March",31);
		month.put("April",30);
		month.put("May",31);
		month.put("June",30);
		month.put("July",31);
		month.put("August",31);
		month.put("September",30);
		month.put("October",31);
		
		Set<Map.Entry<String,Integer>> entry=month.entrySet();
		entry.forEach((v)->System.out.println(v.getKey()));
		
		Set<Map.Entry<String,Integer>> ety=month.entrySet();
		ety.forEach((r)->System.out.println(r.getValue()));
		
		Set<Map.Entry<String,Integer>> enty=month.entrySet();
		Iterator<Map.Entry<String,Integer>> itr=enty.iterator();
		        while(itr.hasNext()) {
		        	Map.Entry<String,Integer> tmp=itr.next();
		        	System.out.println(tmp.getKey());
		        	System.out.println(tmp.getValue());
		        	
		        }
		
		        
		        Map<String,Integer> month1=new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
				month1.put("January",31);
				month1.put("Febrauary",28);
				month1.put("March",31);
				month1.put("April",30);
				month1.put("May",31);
				month1.put("June",30);
				month1.put("July",31);
				month1.put("August",31);
				month1.put("September",30);
				month1.put("October",31);
				
				System.out.println("------------Descending Order---------------");
				
				Set<Map.Entry<String,Integer>> entry1=month1.entrySet();
				entry1.forEach((v)->System.out.println(v.getKey()));
				
				Set<Map.Entry<String,Integer>> ety1=month1.entrySet();
				ety1.forEach((r)->System.out.println(r.getValue()));
				
				Set<Map.Entry<String,Integer>> enty1=month1.entrySet();
				Iterator<Map.Entry<String,Integer>> it=enty1.iterator();
				        while(it.hasNext()) {
				        	Map.Entry<String,Integer> tmp=it.next();
				        	System.out.println(tmp.getKey());
				        	System.out.println(tmp.getValue());
				        	
				        }
				
		        Map<String,Integer> months=new TreeMap<String,Integer>((e1,e2)->e1.compareTo(e2));
				months.put("January",31);
				months.put("Febrauary",28);
				months.put("March",31);
				months.put("April",30);
				months.put("May",31);
				months.put("June",30);
				months.put("July",31);
				months.put("August",31);
				months.put("September",30);
				months.put("October",31);
				
				
				   System.out.println("------Ascending Order------");
				
				Set<Map.Entry<String,Integer>> entry2=months.entrySet();
				entry2.forEach((v)->System.out.println(v.getKey()));
				
				Set<Map.Entry<String,Integer>> entry3=months.entrySet();
				entry3.forEach((r)->System.out.println(r.getValue()));
				
				Set<Map.Entry<String,Integer>> entry4=months.entrySet();
				Iterator<Map.Entry<String,Integer>> it1=entry4.iterator();
				        while(it1.hasNext()) {
				        	Map.Entry<String,Integer> tm=it1.next();
				        	System.out.println(tm.getKey());
				        	System.out.println(tm.getValue());
				        	
				        }
		
		
	}

}
