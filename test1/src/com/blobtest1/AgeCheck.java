package com.blobtest1;

import java.util.Scanner;

public class AgeCheck {
	public static void main(String[] args) {

		int age = -3;

		Scanner reader = new Scanner(System.in);

		System.out.println("How old are you?");

		if (age > 0 && age < 120) {
			System.out.println(age + (" Ok, sounds fine."));
		} else {
			System.out.println(age + ("? Sorry, that is impossible."));
		}

	}

}
