package com.xworkz.toarrayapp;

import java.util.ArrayList;
import java.util.List;
//collection to Array
public class Collection {
	public static void main(String[] args) {
		List collection=new ArrayList<>();
		collection.add("Suman");
		collection.add(34);
		collection.add("Tappu");
		collection.toArray();
		System.out.println(collection);
		
	}

}
