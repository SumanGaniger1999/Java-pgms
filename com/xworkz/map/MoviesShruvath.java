package com.xworkz.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class MoviesShruvath {
	public static void main(String[] args) {
		
		Map<String,Float> movie=new TreeMap<String,Float>((e1,e2)->e2.compareTo(e1));
		
		movie.put("K.G.F:Chapter1",8.3f);
		movie.put("Garuda Gamana Vrishabha Vahana",9.1f);
		movie.put("Kotigobba 3",6.8f);
		movie.put("Sakath",8.6f);
		movie.put("Bhajarangi 2",8.2f);
		movie.put("Avane Srimannarayana",7.9f);
		movie.put("Ratnan Prapancha",8.9f);
		movie.put("Lucia",8.3f);
		movie.put("Ulidavaru Kandanthe",8.4f);
		movie.put("Roberrt",6.6f);
		
		
	
		Set<Map.Entry<String,Float>> enty=movie.entrySet();
		enty.forEach((ent)->System.out.println(ent.getKey()));
		
		Set<Map.Entry<String,Float>> values=movie.entrySet();
		values.forEach((vl)->System.out.println(vl.getValue()));
		
		Set<Map.Entry<String,Float>> values1=movie.entrySet();	
		Iterator<Map.Entry<String,Float>>  itr=values1.iterator();
		//entry.forEach((value)->System.out.println(value+" "+movie.get(value)));
		 while(itr.hasNext()) {
			 Map.Entry<String,Float> tmp=itr.next();
			 System.out.println(tmp.getKey());
			 System.out.println(tmp.getValue());
		 }
		 Map<String,Float> movies=new TreeMap<String,Float>((e1,e2)->e1.compareTo(e2));
			
			movies.put("K.G.F:Chapter1",8.3f);
			movies.put("Garuda Gamana Vrishabha Vahana",9.1f);
			movies.put("Kotigobba 3",6.8f);
			movies.put("Sakath",8.6f);
			movies.put("Bhajarangi 2",8.2f);
			movies.put("Avane Srimannarayana",7.9f);
			movies.put("Ratnan Prapancha",8.9f);
			movies.put("Lucia",8.3f);
			movies.put("Ulidavaru Kandanthe",8.4f);
			movies.put("Roberrt",6.6f);
			
             System.out.println("----------------------------------------");
		
			Set<Map.Entry<String,Float>> enty1=movies.entrySet();
			enty.forEach((ent)->System.out.println(ent.getKey()));
			
			Set<Map.Entry<String,Float>> enty2=movies.entrySet();
			values.forEach((vl)->System.out.println(vl.getValue()));
			
			Set<Map.Entry<String,Float>> enty3=movies.entrySet();	
			Iterator<Map.Entry<String,Float>>  it=values1.iterator();
			//entry.forEach((value)->System.out.println(value+" "+movie.get(value)));
			 while(itr.hasNext()) {
				 Map.Entry<String,Float> tmp=itr.next();
				 System.out.println(tmp.getKey());
				 System.out.println(tmp.getValue());
			 }
	}

}
