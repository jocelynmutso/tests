package com.blobtest1;

import java.util.Scanner;

public class MathOperators2 {
	public static void main(String[] ags) {
		int sum = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");

		int inputNumber = Integer.parseInt(reader.nextLine());
		sum += inputNumber;

		System.out.println("Enter another number");

		inputNumber = Integer.parseInt(reader.nextLine());
		sum += inputNumber;

		System.out.println("Enter your final number");
		inputNumber = Integer.parseInt(reader.nextLine());
		sum += inputNumber;

		System.out.println("The sum of your three numbers is " + sum);

		reader.close();

	}

}
