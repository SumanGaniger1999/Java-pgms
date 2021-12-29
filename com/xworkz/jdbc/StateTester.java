package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.StateDAO;
import com.xworkz.jdbc.dto.StateDTO;

public class StateTester {
	public static void main(String[] args) {
	StateDTO dto[]=new StateDTO[5];
    dto[0]=new StateDTO(1,"Karnataka",050,"Bengaluru");
    dto[1]=new StateDTO(2,"Goa",032 ,"Panaji");
    dto[2]=new StateDTO(3,"JammuKashmir",011,"Srinagar");
    dto[3]=new StateDTO(4,"Assam",036,"Dispur");
    dto[4]=new StateDTO(5,"Rajasthan",07,"Jaipur");
    StateDAO dao=new StateDAO();
    for (int i = 0; i < dto.length; i++) {
		System.out.println(dao.saveState(dto[i]));

	}
	for (int i = 0; i < dto.length; i++) {
		System.out.println(dao.deleteState(dto[i].getId()));
	}
}
}