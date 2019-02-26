package com.blobtest2;

import java.util.Scanner;

public class UpperAndLower {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int inputA;
		int inputB;

		System.out.println("Enter lower number");
		inputA = Integer.parseInt(reader.nextLine());

		System.out.println("Enter upper number");
		inputB = Integer.parseInt(reader.nextLine());

		while (inputA < inputB) {
			inputA++;
			System.out.println(inputA);
		}
	}

}
