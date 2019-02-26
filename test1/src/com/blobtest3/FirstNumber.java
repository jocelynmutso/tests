package com.blobtest3;

import java.util.Scanner;

public class FirstNumber {

	public static void main(String[] args) {

		int inputA = -1;
		int inputB = 0;
		int input = 0;
		int i = 0;

		Scanner reader = new Scanner(System.in);

		while (true) {

			System.out.println("Enter number");
			input = Integer.parseInt(reader.nextLine());
			i++;

			if (input == -1) {
				System.out.println("Terminated");
				System.out.println(inputA);

				if (i < 5) {
					System.err.println("Error");

				} else {
					System.out.println(inputB);
				}

			}

			/*
			 * if(inputA == -1) { inputA = input; }
			 */
			if (i == 5) {
				inputB = input;
			}
		}
	}

}
