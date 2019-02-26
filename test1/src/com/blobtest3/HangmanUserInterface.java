package com.blobtest3;

import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInterface {

	public static void printMenu() {
		System.out.println(" * menu *");
		System.out.println("quit   - quits the game");
		System.out.println("status  - prints the game status");
		System.out.println("a single letter uses the letter as a guess");
		System.out.println("an empty line prints this menu");
	}

	public static void main(String[] args) {

		Hangman hangman = new Hangman();
		Scanner reader = new Scanner(System.in);

		System.out.println("************");
		System.out.println("* Hangman *");
		System.out.println("************");
		System.out.println("");
		printMenu();
		System.out.println("");

		while (hangman.gameOn()) {

			System.out.println("Type a command:");

			String command = reader.nextLine();

			if (command.equals("quit")) {
				System.out.println("Terminated. Thank you for playing!");
				break;

			} else if (command.equals("status")) {
				hangman.printStatus();

			} else if (command.length() == 1) {
				hangman.guess(command);
				hangman.printMan();
				hangman.printWord();
			}

		}
		
		hangman.printStatus();
	}

}