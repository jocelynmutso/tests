package com.blobtest3;

import java.util.Scanner;

public class Methods1 {

	public static void main(String[] args) {

		int input = 0;
		int i = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("How many times would you like to print the message?");
		input = Integer.parseInt(reader.nextLine());
		while (i < input) {
			i++;

			printText();
		}
	}

	public static void printText() {

		System.out.println("In the beginning...");
	}
}
