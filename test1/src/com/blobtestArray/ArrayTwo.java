package com.blobtestArray;
import java.util.ArrayList;

public class ArrayTwo {
	
	public static void main (String [] args) {
		ArrayList<String> teachers = new ArrayList<String>();
		
		teachers.add("Jim");
		teachers.add("John");
		teachers.add("Amanda");
		teachers.add("Jordan");
		teachers.add("Ben");
		teachers.add("April");
		
		for (String teacher : teachers) {
			System.out.println(teacher);
		}
	}

}
