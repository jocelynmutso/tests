package com.blobtestArray;

import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		ArrayList<String> words = new ArrayList<String>();

		System.out.println("Enter a word");
		String input = reader.nextLine();
		words.add(input);

		while (true) {
			System.out.println("Enter another word");
			input = reader.nextLine();
			

			if (words.contains(input)) {
				break;

			} else {
				words.add(input);
			
			}
			
		}
		System.out.println("You gave the same word twice: " + input);
	}
	
}
