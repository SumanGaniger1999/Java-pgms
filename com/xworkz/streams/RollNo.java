package com.xworkz.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class RollNo {
public static void main(String[] args) {
	//group,loop,condition,collect 
	//Streams of(),filter,
	
	     Stream<Integer> roll=Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
	    List<Integer>  temp=roll.filter((r)->r>12 )
	    		.sorted()
	    		.collect(Collectors.toList());
	    
	    temp.forEach((r)->System.out.println(r));
	    
	    System.out.println();
	     Stream<Integer> roll1=Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
	     
	    List<Integer> tmp=roll1.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	   
	   tmp.forEach((a)->System.out.println(a));
	     
	     
}
}
