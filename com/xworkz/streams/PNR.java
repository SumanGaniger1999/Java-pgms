package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNR {
	public static void main(String[] args) {
		
			Stream<String> pnr=Stream.of("X34Q52","A35B64","X13Q45","A67B80","A23D45","X38Y65","X90Z87","A65B43","X34S76","X25Y46","X12Y34","Q78W96","Z45Y63","W23Q65","A67B54","X57Z89","X47V65","A38B76","S95T67","X45Q32");
			     List<String> temp=pnr.sorted().collect(Collectors.toList());
			     temp.forEach((a)->System.out.println(a));
			     
		}
		

	}


