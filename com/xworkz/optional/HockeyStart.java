package com.xworkz.optional;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.optional.dto.HockeyDTO;

public class HockeyStart{
	public static void main(String[] args) {
		HockeyDTO dto=new HockeyDTO("Seattle Kraken",30,10,"India");
		HockeyDTO dto1=new HockeyDTO("Montreal Canadiens",20,18,"Pakistan");
		HockeyDTO dto2=new HockeyDTO("Pittsburgh Penguins",40,10,"Australia");
		HockeyDTO dto3=new HockeyDTO("Detroit Red Wings",25,5,"Germany");
		HockeyDTO dto4=new HockeyDTO("Seattle Kraken",10,5,"India");
		
		boolean t=dto.equals(dto4);
		System.out.println(t);
		
		Set<HockeyDTO> hoc=new  LinkedHashSet<HockeyDTO>();
		hoc.add(dto4);
		hoc.add(dto3);
		hoc.add(dto2);
		hoc.add(dto1);
		hoc.add(dto);
		
		Optional<HockeyDTO> op=hoc.stream().filter((a)->a.getLoses()>10).findFirst();
		System.out.println(op);
	}
	

}
