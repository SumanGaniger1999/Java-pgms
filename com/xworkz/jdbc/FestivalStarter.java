package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.FestivalDAO;
import com.xworkz.jdbc.dto.FestivalDTO;

public class FestivalStarter {
	public static void main(String[] args) {
		
		FestivalDTO dto=new FestivalDTO(1,"Holi","2022-01-18","Karnataka");
		FestivalDTO dto1=new FestivalDTO(2,"Ugadi","2022-04-02","Karnataka");
		FestivalDTO dto2=new FestivalDTO(3,"Diwali","2022-10-22","AndraPradesh");
		FestivalDTO dto3=new FestivalDTO(4,"Ganesh Chaturthi","2022-08-31","Karnataka");
		FestivalDTO dto4=new FestivalDTO(5,"Dussehra","2022-10-25","Karnataka");
		FestivalDAO dao=new FestivalDAO();
//		System.out.println(dao.saveFestival(dto));
//		System.out.println(dao.saveFestival(dto1));
//		System.out.println(dao.saveFestival(dto2));
//		System.out.println(dao.saveFestival(dto3));
//		System.out.println(dao.saveFestival(dto4));
        System.out.println( dao.deleteFestival(1));
		
		
	}

}
