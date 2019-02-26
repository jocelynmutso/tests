package com.blobtest2;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main (String [] args) {
		
		int input = 0;
		int sum = 0;
		int i = 0;
		
		Scanner reader = new Scanner (System.in);
		
		
		while (i < 5) {
		System.out.println("Enter number");
		input = Integer.parseInt(reader.nextLine());
		sum = input + sum;
		i++;
		
	}
		System.out.println(sum);

}
}
