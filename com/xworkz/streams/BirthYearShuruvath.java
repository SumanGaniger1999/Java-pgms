package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYearShuruvath {
public static void main(String[] args) {
	Stream<Integer> birth=Stream.of(1999,2000,1999,1998,1996,2001,1997,1998,2000,2001,2002,1995,1997,2003,1997,1996,2004,2001,1993,1992);
	List<Integer> tmp= birth.filter((a)->a>1999).sorted().collect(Collectors.toList());
	tmp.forEach((a)->System.out.println(a));


        
}
}
