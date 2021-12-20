package com.xworkz.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaStart {
	public static void main(String[] args) {
		Stream<String> area=Stream.of("Rajajinagar","Gayatrinagar","Vijyanagar","JPnagar","Padmanabhanagar","Banashankari","Uttarahalli","Kumaraswamy","Girinagar","Jayanagar","Basveswarnagar","HSR Layout","Bommanahalli","Koramangala","Indiranagar","Yelahanka","BTM Layout","Bellandur","Yeshwantpur","Malleswara");
		List<String> tmp=area.map(String::toLowerCase).sorted().collect(Collectors.toList());
		  System.out.println("Printing Ascending order");
		tmp.forEach((a)->System.out.println(a));
		
		System.out.println();
		
		Stream<String> ar=Stream.of("Rajajinagar","Gayatrinagar","Vijyanagar","JPnagar","Padmanabhanagar","Banashankari","Uttarahalli","Kumaraswamy","Girinagar","Jayanagar","Basveswarnagar","HSR Layout","Bommanahalli","Koramangala","Indiranagar","Yelahanka","BTM Layout","Bellandur","Yeshwantpur","Malleswara");
		List<String> temp=ar.map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println("Printing Descending order");
		temp.forEach((a)->System.out.println(a));
		
	}

}
