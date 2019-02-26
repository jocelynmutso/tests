package com.blobtestString;

import java.util.Scanner;

public class NamePracticeJohn {

	public static void calculateCharacters(String input) {

		System.out.println("Your  name is " + input + " and your name has " + input.length() + " characters");
	}
	
	public static void firstCharacter (String input) {
		
		char character = input.charAt(0);
		System.out.println("The first character in your name is " + input.charAt(0));
	}
	
	public static void lastCharacter(String input) {
		
		char lastChar = input.charAt(input.length()-1);
		System.out.println("The last char in your name is " + lastChar);
			
	}

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your name");
		String input = reader.nextLine();
		
		calculateCharacters(input);
		firstCharacter(input);
		lastCharacter(input);

	}

}
