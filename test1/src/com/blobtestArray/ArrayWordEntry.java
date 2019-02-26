package com.blobtestArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayWordEntry {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		ArrayList<String> names = new ArrayList<String>();

		System.out.println("Enter a name: ");
		String name = reader.nextLine();
		names.add(name);

		while (true) {
			if (name.isEmpty()) {
				break;

			} else {
				System.out.println("Add a name");
				name = reader.nextLine();
				names.add(name);
			}

		}
			for (String toPrint : names) {
				System.out.println(toPrint);
			}
		}
}
