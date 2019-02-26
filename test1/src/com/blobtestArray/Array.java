package com.blobtestArray;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {

		ArrayList<String> teachers = new ArrayList<String>();

		teachers.add("John");
		teachers.add("Barto");
		teachers.add("Amy");
		teachers.add("June");
		teachers.add("Barry");
		teachers.add("April");
		teachers.add("Derek");

		System.out.println("There are " + teachers.size() + " teachers.");
		System.out.println("The first teacher on the list is " + teachers.get(0));
		System.out.println("The last teacher on the list is " + teachers.get(4));

		teachers.remove("Barto");

		if (teachers.contains("Barto")) {
			System.out.println("Barto is on the list");
		} else {
			System.out.println("Barto is not on the list");
		}

		int place = 0;
		while (place < teachers.size()) {
			System.out.println(teachers.get(place));
			place++;
		}

	}
}
