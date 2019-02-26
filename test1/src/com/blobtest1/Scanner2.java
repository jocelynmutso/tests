package com.blobtest1;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {

		String promptA = "Let's add. Please give me an integer number.";
		String promptB = "Great, now please give me another integer number.";
		String promptC = "Thanks, now, let's divide. Please give me a number.";
		String promptD = "Thanks, now, give me one more number.";
		String promptE = "Ok, now let's find out which of two numbers is greater. Please give me a number.";
		String promptF = "Thanks, now please give me another number.";

		Scanner reader = new Scanner(System.in);
		System.out.println(promptA);
		int number = Integer.parseInt(reader.nextLine());
		System.out.println(promptB);

		int number2 = Integer.parseInt(reader.nextLine());
		System.out.println("The sum of your number is " + (number + number2));

		System.out.println(promptC);
		double decimal = Double.parseDouble(reader.nextLine());
		System.out.println(promptD);
		double decimal2 = Double.parseDouble(reader.nextLine());
		System.out.println("The quotient of your two numbers is " + (decimal / decimal2));

		System.out.println(promptE);
		double max1 = Double.parseDouble(reader.nextLine());
		System.out.println(promptF);
		double max2 = Double.parseDouble(reader.nextLine());
		System.out.println("You entered " + max1 + " ,and " + max2 + " and the greater of those two numbers is "
				+ (Math.max(max1, max2)));

	}

}
