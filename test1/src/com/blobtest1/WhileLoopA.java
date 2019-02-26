package com.blobtest1;

import java.util.Scanner;

public class WhileLoopA {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (true) {
			System.out.println("I am awesome!");
			System.out.println("Am I still awesome?");
			String command = reader.nextLine();

			if (command.equals("no")) {
				break;

			}

		}

		System.out.println("That's it, then!");
	}

}
