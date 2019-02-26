package com.blobtestArray;
import java.util.*;

public class OrderingBySizeArray {
	
	public static void main (String [] args) {
		
		
		ArrayList<String> teachers = new ArrayList<String>();
		
		teachers.add("Janice");
		teachers.add("Bob");
		teachers.add("Alice");
		teachers.add("Alexandria");
		teachers.add("Yu");
		
		Collections.sort(teachers);
		
		for (String teacher : teachers) {
			System.out.println(teacher);
			
		}
	}

}
