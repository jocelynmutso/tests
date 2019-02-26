package com.blobtest2;
import java.util.Scanner;


public class upToNumber {
	public static void main (String [] args) {
		
		int startNumber = 0;
		int input;
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Enter number");
		input = Integer.parseInt(reader.nextLine());
		
		while (startNumber < input) {
			startNumber++;
			System.out.println(startNumber);
		}
		
	
	}
}
