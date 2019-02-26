package com.blobtest1;

import java.util.Scanner;

public class ManyNumbersPractice {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int sum = 0;

		System.out.println("Enter first number");
		int inputText = Integer.parseInt(reader.nextLine());
		sum = sum + inputText;
		
		System.out.println("Enter second number");
		inputText = Integer.parseInt(reader.nextLine());
		sum = sum + inputText;
		
		System.out.println("Enter third number");
		inputText = Integer.parseInt(reader.nextLine());
		System.out.println("Your total is " + (sum + inputText));

	}

}
