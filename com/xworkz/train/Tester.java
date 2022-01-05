package com.xworkz.train;

import com.xworkz.train.dao.TrainDAO;
import com.xworkz.train.dto.TrainDTO;

public class Tester {
	public static void main(String[] args) {
		TrainDTO dto[]=new TrainDTO[4];
		dto[0]=new TrainDTO(1,213456,"Banglore","jamkhandi",32,104,"sleeper","sss Huballi Express");
		dto[1]=new TrainDTO(2,345678,"Chennai","Bagalkot",35,302,"general","Vishwanava Express");
		dto[2]=new TrainDTO(3,164784,"Delhi","Mumbai",56,865,"sleeper","Karatagi Express");
		dto[3]=new TrainDTO(4,143563,"Mumbai","Hubali",45,356,"sleeper","Siddhaganga SF Express ");
		
		TrainDAO dao=new TrainDAO();
//		for (int i = 0; i < dto.length; i++) {
//			dao.save(dto[i]);
//			
//		}
//		dao.deleteByTrainNo(164784);
////		
//		dao.deleteByTrainNoAndId(143563,4);
//		dao.getByTrainNo(213456);
//		dao.getAll();
//		dao.getAllByBoarding("Banglore");
//		dao.getAllByDestination("jamkhandi");
//		dao.getTotal();
//		dao.updateDestinationAndBoardingByTrainNo("Gujarat","Bagalkot",213456);
		dao.updateDestinationByTrainNo("Tumkur",345678);
		
		
	}
        
}
