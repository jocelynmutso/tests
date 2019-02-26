package com.blobtest2;

import java.util.Scanner;

public class ManyNumbersFinalExercise {

	public static void main(String[] args) {

		int input = 0;
		int sum = 0;
		int i = 0;
		int average = 0;
		int evenNumber = 0;

		Scanner reader = new Scanner(System.in);

		while (true) {
			
			// 1. read number
			System.out.println("Enter a number");
			input = Integer.parseInt(reader.nextLine());
			
			// 2 terminate - print result
			if (input == -1) {
				System.out.println("Sorry, try again");
				System.out.println("Your sum is " + sum);
				System.out.println("You typed " + i + " numbers");
				System.out.println("The average of your numbers is "+ average);
				System.out.println("Your even numbers are " + evenNumber);
				System.out.println("Your odd numbers are " + (i - evenNumber));

				break;
			}

			// 3.1 is the number even 
			if(input % 2 == 0) {
				evenNumber++;
			} else {
			// 3.2 number is odd
			}
			
			// 4. total
			sum = input + sum;
			
			// 5. number of user inputs
			i++;
						
			// 6. average
			average = sum / i;
						
		}

	}
}
