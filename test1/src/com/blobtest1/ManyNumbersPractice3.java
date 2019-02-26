package com.blobtest1;

import java.util.Scanner;

public class ManyNumbersPractice3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;

		while (true) {

			System.out.println("Enter number");
			int inputText = Integer.parseInt(reader.nextLine());
			sum = sum + inputText;
			System.out.println("Your sum is " + sum);

			if (inputText == 0) {
				System.out.println("Error-cannot use 0");
				break;
			}

		} 
		reader.close();
	}

}
