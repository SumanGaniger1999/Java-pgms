package com.xworkz.listapp;

import java.util.Arrays;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		String b[]= {"Apple","Pineapple"};
		
		
		List<String> list=Arrays.asList(b);

		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
		}
	
}}