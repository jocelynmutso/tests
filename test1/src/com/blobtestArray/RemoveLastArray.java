package com.blobtestArray;
import java.util.*;

public class RemoveLastArray {
	
	public static void removeLast(List<String> names) {
		names.remove(names.size() -1);
		
	}
	
	public static void main (String [] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("John");
		names.add("Bob");
		names.add("Amy");
		names.add("Mike");
		names.add("Juri");
		names.add("Mae");

		
		Collections.sort(names);
		System.out.print("Names:");
		System.out.println(names);
		removeLast(names);
		
		System.out.print("Names:");
		System.out.println(names);
					
	}

}
