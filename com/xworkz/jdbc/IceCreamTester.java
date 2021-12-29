package com.xworkz.jdbc;

import java.util.Iterator;

import com.xworkz.jdbc.dao.IceCreamDAO;
import com.xworkz.jdbc.dto.IceCreamDTO;

public class IceCreamTester {
	public static void main(String[] args) {
		IceCreamDTO dto[] = new IceCreamDTO[5];
		dto[0] = new IceCreamDTO(1, "Strawberry", "Corenetto", 100);
		dto[1] = new IceCreamDTO(2, "Vanilla", "StonyField", 200);
		dto[2] = new IceCreamDTO(3, "Butterscotch", "Graeters", 350);
		dto[3] = new IceCreamDTO(4, "Mango", "Amul", 0);
		dto[4] = new IceCreamDTO(5, "Chocolate", "Talenti", 0);
		IceCreamDAO dao = new IceCreamDAO();

		for (int i = 0; i < dto.length; i++) {
			System.out.println(dao.saveDTO(dto[i]));

		}
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dao.deleteIceCream(dto[i].getId()));
		}
	}

}
