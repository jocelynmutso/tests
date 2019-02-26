package com.blobtestArray;
import java.util.*;

public class ArrayListMethodParameter {
	
	public static void print(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	public static void main (String [] args) {
		ArrayList<String> names =  new ArrayList<String>();
		
		names.add("Julie");
		names.add("Amy");
		names.add("Charles");
		names.add("Doug");
		
		ArrayList<String> countries = new ArrayList();
		
		countries.add("Bolivia");
		countries.add("Spain");
		countries.add("Canada");
		
		print(names);
		System.out.println("");
		print(countries);
				
	}

}
