package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.CountryDAO;
import com.xworkz.jdbc.dto.CountryDTO;

public class CountryTester {
	public static void main(String[] args) {
		CountryDTO dto[]=new CountryDTO[5];
		dto[0]=new CountryDTO(1,"India",91 ,"Asia");
		dto[1]=new CountryDTO(2,"SriLanka",92, "Asia");
		dto[2]=new CountryDTO(3,"WestIndies",73 ,"Asia");
		dto[3]=new CountryDTO(4,"Korea",07 ,"Asia");
		dto[4]=new CountryDTO(5,"China",04 ,"Asia");
		CountryDAO dao=new CountryDAO();
//		for (int i = 0; i < dto.length; i++) {
//			System.out.println(dao.saveCountry(dto[i]));
//			
//		}
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dao.deleteCountry(dto[i].getId()));
			
		}
	}

}
