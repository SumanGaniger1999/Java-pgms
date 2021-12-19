package com.xworkz.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bar {
public static void main(String[] args) {
	Map<String,Integer> bar=new HashMap<String,Integer>();
	
	bar.put("Beer Garden",70);
	bar.put("The Love Shack",60);
	bar.put("Stag Nite Bar",90);
	bar.put("New Jack Swing Bar",50);
	bar.put("Wild Rover Pub",54);
	bar.put("Whistle Stop Club",43);
	bar.put("The High Five Bar",67);
	bar.put("Start the Fire",30);
	bar.put("White Rabbit",70);
	bar.put("Up in Smoke",40);
	
	Set<Map.Entry<String,Integer>> entry=bar.entrySet();
	entry.forEach((c)->System.out.println(c.getValue()));
	
	Set<Map.Entry<String,Integer>> entry1=bar.entrySet();
	entry.forEach((c)->System.out.println(c.getKey()));
	
	Set<Map.Entry<String,Integer>> entry2=bar.entrySet();
	entry.forEach((c)->System.out.println(c.getKey()+" "+c.getValue()));
	
	Set<Map.Entry<String,Integer>> entry3=bar.entrySet();
	Iterator<Map.Entry<String,Integer>> itr=entry3.iterator();
	while (itr.hasNext()) {
		Map.Entry<String,Integer> tmp=itr.next();
		System.out.println(tmp.getKey());
		System.out.println(tmp.getValue());
		
	}
	System.out.println("------------------------------");
	
	Map<String,Integer> bar1=new TreeMap<String,Integer>((e1,e2)->(e2.compareTo(e1)));
	bar1.put("Beer Garden",70);
	bar1.put("The Love Shack",60);
	bar1.put("Stag Nite Bar",90);
	bar1.put("New Jack Swing Bar",50);
	bar1.put("Wild Rover Pub",54);
	bar1.put("Whistle Stop Club",43);
	bar1.put("The High Five Bar",67);
	bar1.put("Start the Fire",30);
	bar1.put("White Rabbit",70);
	bar1.put("Up in Smoke",40);
	
	Set<Map.Entry<String,Integer>> value1=bar1.entrySet();
	value1.forEach((s)->System.out.println(s.getKey()));
	
	Set<Map.Entry<String,Integer>> value2=bar1.entrySet();
	value1.forEach((s)->System.out.println(s.getValue()));
	
	Set<Map.Entry<String,Integer>> value3=bar1.entrySet();
	value1.forEach((s)->System.out.println(s.getKey()+" " +s.getValue()));
	
	Set<Map.Entry<String,Integer>> value4=bar1.entrySet();
	Iterator<Map.Entry<String,Integer>> it=entry3.iterator();
	while (itr.hasNext()) {
		Map.Entry<String,Integer> tmp=itr.next();
		System.out.println(tmp.getKey());
		System.out.println(tmp.getValue());
		
	}
 
	System.out.println("-----------------------");
	Map<String,Integer> bar2=new TreeMap<String,Integer>();
	bar2.put("Beer Garden",70);
	bar2.put("The Love Shack",60);
	bar2.put("Stag Nite Bar",90);
	bar2.put("New Jack Swing Bar",50);
	bar2.put("Wild Rover Pub",54);
	bar2.put("Whistle Stop Club",43);
	bar2.put("The High Five Bar",67);
	bar2.put("Start the Fire",30);
	bar2.put("White Rabbit",70);
	bar2.put("Up in Smoke",40);
	
	Set<Map.Entry<String,Integer>>  values1=bar2.entrySet();
	values1.forEach((e)->System.out.println(e.getKey()));
	
	Set<Map.Entry<String,Integer>> values2=bar2.entrySet();
	values2.forEach((r)->System.out.println(r.getValue()));
	
	Set<Map.Entry<String,Integer>> values3=bar2.entrySet();
	values3.forEach((t)->System.out.println(t.getKey()+" "+t.getValue()));
	
	Set<Map.Entry<String,Integer>> values4=bar2.entrySet();
	Iterator<Map.Entry<String,Integer>> it1=values4.iterator();
	   while(it1.hasNext()) {
		   Map.Entry<String,Integer> tm=it1.next();
		   System.out.println(tm.getKey());
		   System.out.println(tm.getValue());
	   }
	
}
}
