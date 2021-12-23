package com.xworkz.optional;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.optional.dto.ProductDTO;

public class ProductStart {
	public static void main(String[] args) {
		ProductDTO dto=new ProductDTO(1,"Amul","Milk",100,4);
		ProductDTO dto1=new ProductDTO(2,"Fortune","Oil",90,1);
		ProductDTO dto2=new ProductDTO(3,"HeroHonda","Bike",73900,2 );
		ProductDTO dto3=new ProductDTO(4,"Dairy Milk","Chocolate",200,10);
		ProductDTO dto4=new ProductDTO(5,"Goorej","Washing Machine",12990,3);
		
		boolean booln=dto.equals(dto3);
		System.out.println(booln);
		
		Set<ProductDTO> product=new LinkedHashSet<ProductDTO>();
		product.add(dto4);
		product.add(dto3);
		product.add(dto2);
		product.add(dto1);
		product.add(dto);
		Optional<ProductDTO> opt=product.stream().filter((a)->a.getPrice()>200).findFirst();
	    System.out.println(product.size());
		System.out.println(opt);
	}

}
