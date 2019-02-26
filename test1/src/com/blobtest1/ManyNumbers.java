package com.blobtest1;

import java.util.Scanner;

public class ManyNumbers {
	public static void main(String[] args) {
		int sum = 0;

		Scanner reader = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a number");
			String inputText = reader.nextLine();

			if (inputText.contentEquals("0")) {
				break;
			}

			int read = Integer.parseInt(inputText);
			sum += read;

			System.out.println("Your sum is now " + sum);

		}
		reader.close();
	}

}
