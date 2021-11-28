package com.xworkz.descendingapp;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDescending {
	public static void main(String[] args) {
		String b[]= {"Goa","Karnataka","JammuKashmir","UttarPradesh"};
		Arrays.sort(b,Collections.reverseOrder());
		for(int i=0;i<b.length;i++) {
	  System.out.println(b[i]);
		
		}
		Integer arr[]= {3,6,2,34};
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		Float arry[]= {(float)3.2,(float)6.2,(float)4.3};
		Arrays.sort(arry,Collections.reverseOrder());
		for(int i=0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
		Character c[]= {'A','Z','W','T'};
		Arrays.sort(c,Collections.reverseOrder());
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
		
		
	}

}
