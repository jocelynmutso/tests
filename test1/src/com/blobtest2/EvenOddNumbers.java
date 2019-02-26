package com.blobtest2;

public class EvenOddNumbers {

	public static void main(String[] args) {

		int sum = 0;

		while (sum <= 20) {

			if (sum % 2 == 0) {
				System.out.println(sum);
			}

			sum++;
		}
	}
}
