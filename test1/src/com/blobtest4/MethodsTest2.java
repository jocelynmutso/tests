package com.blobtest4;

import java.util.Scanner;

public class MethodsTest2 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Type the first number");
		int first = Integer.parseInt(reader.nextLine());

		System.out.println("Type the second number");
		int second = Integer.parseInt(reader.nextLine());

		System.out.println("total " + sum(first, second));
		

	}
	public static int sum(int first, int second) {
		return (first + second);

	}
	public static double average(int firstNumber, int secondNumber, int thirdNumber) {
		int sum = firstNumber + secondNumber + thirdNumber;
		double average = sum / 3;
		return average;
		
	}

	

	

}