package com.blobtestString;

import java.util.Scanner;

public class EndPart {
	
	public static void main (String [] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word = reader.nextLine();
		System.out.println("What is the length of the last part?");
		int last = Integer.parseInt (reader.nextLine());
		
		System.out.println(word);
		System.out.println("result: " + word.substring(word.length() -last));
	}

}
