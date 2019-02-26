package com.blobtest2;

import java.util.Scanner;

public class sumOfManyNumbers {
	public static void main(String[] args) {

		int sum = 0;
		int input;

		Scanner reader = new Scanner(System.in);

		while (true) {

			System.out.println("Enter a number");
			input = Integer.parseInt(reader.nextLine());
			sum = input + sum;

			if (input <= 0) {
				break;
			}
		}
		System.out.println("The sum of all your numbers is " + sum);
	}
}
