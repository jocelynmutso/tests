package com.blobtest2;
import java.util.Scanner;

public class SumOfNumbers2 {
	
	public static void main (String [] args) {
		
		int sum = 0;
		int input = 0;
		int i = 0;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Until which number shall I count?");
		input = Integer.parseInt(reader.nextLine());
		
		while (i < input) {
			i++;
			sum += i;
						
		}
		
		System.out.println("The sum of the numbers before yours is " + sum);
	}

}
