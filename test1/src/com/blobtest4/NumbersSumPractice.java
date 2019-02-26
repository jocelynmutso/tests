package com.blobtest4;

public class NumbersSumPractice {

	public static int greatest(int... numbers) {
		int greatest = 0;

		for (int number1 : numbers) {
			if (greatest <= number1) {
				greatest = number1;
			}

		}
		return greatest;
	}

	public static int sum(int  ... numbers) {
		int answer = 0;
		for (int number1 : numbers) {
			answer = (answer + number1);
		}

		
		return answer;

	}

	public static int least(int numberA, int numberB) {
		if (numberA == numberB) {
			return numberA;

		} else if (numberA < numberB) {
			return numberA;
		} else {
			return numberB;
		}
	}

	public static void main(String[] args) {
		int answer = sum(3, 4, 5, 6);
		System.out.println("sum: " + answer);

		int answerA = least(2, 7);
		System.out.println("least: " + answerA);

		System.out.println(new StringBuilder().append("least: ").append(answerA));
		System.out.println(String.format("least: %d", answerA));

		System.out.println(greatest(1, 2, 3, 4, 5, 6, 7));
	}

}