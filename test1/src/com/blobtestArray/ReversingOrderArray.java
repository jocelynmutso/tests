package com.blobtestArray;

import java.util.*;

public class ReversingOrderArray {

	public static void main(String[] args) {

		ArrayList<String> teachers = new ArrayList<String>();

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a name");
		String input = reader.nextLine();
		teachers.add(input);

		while (true) {
			System.out.println("Enter a name");
			input = reader.nextLine();
			teachers.add(input);

			 if (input.isEmpty()) {
				 Collections.reverse(teachers);
				 for (String teacher : teachers) {
					 System.out.println(teacher);
					 
					
				 }
				 break;
			}
		}
	}
}



