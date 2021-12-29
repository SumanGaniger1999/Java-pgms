package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.CityDAO;
import com.xworkz.jdbc.dto.CityDTO;

public class CityTester {
	public static void main(String[] args) {
		
	CityDTO dto[]=new CityDTO[5];
	dto[0]=new CityDTO(1,"Jamkhandi",330000l);
	dto[1]=new CityDTO(2,"Bengaluru",8440000l);
	dto[2]=new CityDTO(3,"Mumbai ",12500000l);
	dto[3]=new CityDTO(4,"Delhi",19000000l);
	dto[4]=new CityDTO(5,"Chennai",7000000l);
	CityDAO dao=new CityDAO();
	for (int i = 0; i < dto.length; i++) {
		System.out.println(dao.saveCity(dto[i]));
	}
	for (int i = 0; i < dto.length; i++) {
		System.out.println(dao.deleteCity(dto[i].getId()));
	}
	}
}
