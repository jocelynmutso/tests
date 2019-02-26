package com.blobtest2;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {

		int intA = 0;
		int intB = 0;
		int sum = 0;
		
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter number");
		intA = Integer.parseInt(reader.nextLine());

		System.out.println("Enter number");
		intB = Integer.parseInt(reader.nextLine());
		
		while (intA <= intB) {
			sum += intA;
			intA++;
							
		}
		System.out.println(sum);	
	}
}
