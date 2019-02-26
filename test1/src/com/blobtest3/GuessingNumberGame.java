package com.blobtest3;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberDrawn = drawNumber();
		int guess = 1;

		while (true) {
			System.out.println("Guess number");
			int user = Integer.parseInt(reader.nextLine());

			if (user == numberDrawn) {
				System.out.println("Congratulations! You guessed correctly!");
				break;

			} else if (user != numberDrawn) {
				if (user < numberDrawn) {
					System.out.println("Your guess is too low, guesses made " + guess);
					
				}  
				
				else if (user > numberDrawn) {
				System.out.println("Your guses is too high, guesses made " + guess);
				
			}

			guess++;
		}
		}
		
	}

	public static int drawNumber() {
		return new Random().nextInt(101);
	}
}
