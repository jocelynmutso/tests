package com.blobtest1;

import java.util.Scanner;

public class BigNumbersPractice {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Input numbers!");
		int inputA = 0;
		int sum = 0;
		int count = 0;

		while (inputA != -1) {
			inputA = Integer.parseInt(reader.nextLine());

			if (inputA == -1) {
				System.out.println("Congrats, you guessed the correct number!");
				System.out.println("Your sum is " + sum);
				System.out.println("You have entered " + count + " numbers");
				break;
			}
			sum = sum + inputA;
			++count;
												

		}

	}
}
