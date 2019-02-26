package com.blobtest1;

import java.util.Scanner;

public class BetweenNumbers {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number");

		int start = Integer.parseInt(reader.nextLine());

		System.out.println("Enter number");

		int end = Integer.parseInt(reader.nextLine());

		if (start >= end) {
			System.out.println("First number must be smaller. Enter numbers again");

		} else {

			int index = start;

			System.out.println("Your first number was " + start);

			while (++index < end) {
				System.out.println(index);
			}

			System.out.println("Your second number was " + end);
		}
	}

}
