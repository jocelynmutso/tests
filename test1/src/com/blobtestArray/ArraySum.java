package com.blobtestArray;

import java.util.*;

public class ArraySum {

	public static int sum(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;

		}

		return sum;
	}

	public static double average(List<Integer> numbers) {
		int sum = sum(numbers);
		return sum / numbers.size();
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println("The sum is " + sum(numbers));

		numbers.add(10);

		System.out.println("Now the sum is " + sum(numbers));
		System.out.println("Now the average is " + average(numbers));

	}

}
