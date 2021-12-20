package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmShuruvath {
	// TODO Auto-generated constructor stub
public static void main(String[] args) {
	Stream<Integer> atm=Stream.of(3452,3564,1345,6780,2345,3865,9087,6543,3476,2546,1234,7896,4563,2365,6754,5789,4765,3876,9567,4532);
	     List<Integer> temp=atm.filter((a)->a>1000).sorted().collect(Collectors.toList());
	     temp.forEach((a)->System.out.println(a));
	     
}
}


