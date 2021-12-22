package com.xworkz.streamDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.streamDTO.dto.CafeDTO;

public class CafeStart {
public static void main(String[] args) {
	CafeDTO dto=new CafeDTO(1,"CafeTree","Mudhol",4.1f);
	CafeDTO dto1=new CafeDTO(2,"McDonalds","Banglore",4.5f);
	CafeDTO dto2=new CafeDTO(3,"BlueBerry","Dharwad",3.2f);
	CafeDTO dto3=new CafeDTO(4,"CafeAda","Mudhol",2.0f);
	CafeDTO dto4=new CafeDTO(5,"Cafe Noir","Banglore",3.0f);
	
	List<CafeDTO> cafe=new ArrayList<CafeDTO>();
	cafe.add(dto4);
	cafe.add(dto3);
	cafe.add(dto2);
	cafe.add(dto1);
	cafe.add(dto);
	
	cafe.stream().filter((e)->e.getRating()>3).sorted((d1,d2)->d2.getName().compareTo(d1.getName())).collect(Collectors.toList()).forEach((e)->System.out.println(e));
}
}
