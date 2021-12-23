package com.xworkz.optional;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.optional.dto.CompanyDTO;

public class CompanyBeginner {
	public static void main(String[] args) {
		CompanyDTO dto=new CompanyDTO( 1,"Legato","Mosur Saisekar ",5131352500.00d);
		CompanyDTO dto1=new CompanyDTO( 2,"Intellect","Arun Jain",4131352500.00d);
		CompanyDTO dto2=new CompanyDTO( 3,"Accenture","Julie Sweet",4131710000000.00d);
		CompanyDTO dto3=new CompanyDTO( 4,"hp","Enrique Lores",4909108337500.00d);
		CompanyDTO dto4=new CompanyDTO( 5,"Wipro","Thierry Delaporte",6131710000000.00d);
	   
		boolean booln=dto.equals(dto4);
		System.out.println(booln);
		Set<CompanyDTO> cmpy=new LinkedHashSet<CompanyDTO>();
		cmpy.add(dto4);
		cmpy.add(dto3);
		cmpy.add(dto2);
		cmpy.add(dto1);
		cmpy.add(dto);
		
		Optional<CompanyDTO> opt=cmpy.stream().filter((e)->e.getName().equals("Legato")).findFirst(); 
		System.out.println(opt);
		
	}

}
