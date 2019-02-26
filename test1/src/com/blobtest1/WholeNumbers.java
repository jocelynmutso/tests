package com.blobtest1;

public class WholeNumbers {

	public static void main(String[] args) {
		int numberA = 1;

		/*
		 * while (numberA < 11) { System.out.println(numberA); numberA++;
		 * 
		 * }
		 * 
		 */

		int numberB = 0;
		
		while (numberB <= 100) {
			numberB += 1;

			if (numberB % 2 == 0) {
				System.out.println(numberB);
			}

		}

	}

}
