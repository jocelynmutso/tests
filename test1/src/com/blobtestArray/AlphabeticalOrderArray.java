package com.blobtestArray;
import java.util.*;

public class AlphabeticalOrderArray {
	
	public static void main (String [] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a name");
		String input = reader.nextLine();
		
		names.add(input);
		
		while (true) {
			System.out.println("Enter name");
			input = reader.nextLine();
			names.add(input);
			
			if (input.isEmpty()) {
					Collections.sort(names);
					for (String name : names) {
					System.out.println(name);
				}
			}
						
		}
						
	}
}
