package com.blobtestString;

import java.util.Scanner;

public class FirstThreeChar {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter your name");

		String input = reader.nextLine();
		int numberChar = input.length();
		if (numberChar <= 3) {
			System.out.println("Sorry, name too short! Enter longer one");
			return;
		}

		char first = input.charAt(0);
		char second = input.charAt(1);
		char third = input.charAt(2);

		System.out.println("The first letter of your name is " + first + ", the second letter is " + second
				+ ", and the third letter is " + third);

	}

}
