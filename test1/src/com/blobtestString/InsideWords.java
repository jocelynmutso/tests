package com.blobtestString;

import java.util.Scanner;

public class InsideWords {
	
	public static void main (String []args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first word");
		String first = reader.nextLine();
		System.out.println("Enter second word");
		String second = reader.nextLine();

		if (first.indexOf(second) > -1) {
			System.out.println(String.format("The word '%s' is found in the word '%s'.", first, second));
		} else {
			System.out.println(String.format("The word '%s' is not found in the word '%s'.", first, second));
		}
		

		
		
	}
	

}
