package com.blobtest1;

import java.util.Scanner;

public class Username {

	public static void main(String[] args) {

		String alexPassword = "mightyducks";
		String emilyPassword = "cat";
	
		System.out.println("Input Username:");
		Scanner reader = new Scanner(System.in);
		String username = reader.nextLine();

		if (!username.equals("alex") || !username.equals("emily")) {

			System.out.println("Input Password:");

		} else {
			System.out.println("Sorry, please try again. Input username.");
		}

		String password = reader.nextLine();

		if (username.equals("alex")
				&& (password.equals("mightyducks") || (username.equals("emily") && (password.equals("cat"))))) {
			System.out.println("Logged in");
		}

		else {
			System.out.println("Sorry, wrong password. Login terminated.");

		}

	}

}
