package com.blobtest1;

import java.util.Scanner;

public class SecretPassword {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		final String password = "carrot";

		while (true) {
			System.out.println("Enter the password:");
			String command = reader.nextLine();

			if (command.equals(password)) {
				System.out.println("Successful log in");
				break;

			} else {
				System.out.println("Wrong password: Try again");
			}
		}
		
		reader.close();
	}
}
