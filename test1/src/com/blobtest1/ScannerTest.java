package com.blobtest1;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("What is your name?");
		String name = reader.nextLine();

		System.out.println("Hello," + name);

		System.out.println("How old are you? Type an integer ");
		int number = Integer.parseInt(reader.nextLine());
		System.out.println("You typed: " + number);
		
		System.out.println("Your name is" + name + " and you are " + number + " years old.");

	}

}
