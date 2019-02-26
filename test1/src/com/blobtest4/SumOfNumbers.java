package com.blobtest4;

public class SumOfNumbers {

	public static int sum(int number1, int number2, int number3, int number4) {
		int answer = number1 + number2 + number3 + number4;
		return answer;
	}

	public static int least(int numberA, int numberB) {
		int answerA = 0;
		if (numberA == numberB) {
			answerA = numberA;
		} else if (numberA < numberB) {
			return numberA;
		} else if (numberA > numberB) {
			return numberB;
		}
		return answerA;
	}

	public static void main(String[] args) {
		int answer = sum(4, 3, 2, 1);
		System.out.println("sum " + answer);

		int answerA = least(2, 7);
		System.out.println("Least " + answerA);

	}

}
