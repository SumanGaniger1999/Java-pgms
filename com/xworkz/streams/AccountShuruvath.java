package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountShuruvath {
	public static void main(String[] args) {
		Stream<Long> acct=Stream.of(123456789012l,234567890123l,235689076543l,456789087654l,567890654321l,547897654321l,654378907654l,253746538765l,478943208765l,109876234597l,134906547893l,345278956743l,390876542109l,763286543209l,548976324567l,109287654323l,109356738476l,534567890543l,109487653456l,5487349873221l);
		            List<Long>  temp=acct.filter((act)->act<567890654321l).collect(Collectors.toList());
		            temp.forEach((act)->System.out.println(act));
		            
	}

}
