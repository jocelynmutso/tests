package com.blobtest2;
import java.util.Scanner;

public class Exercise25{
	public static void main (String [] args) {
		Scanner reader = new Scanner(System.in);
	
		int sum = 0;
		int input;
	
		System.out.println("Enter a number");
		input = Integer.parseInt(reader.nextLine());
		sum = sum + input;
		
		System.out.println("Enter a number");
		input = Integer.parseInt(reader.nextLine());
		sum = sum + input;
		
		System.out.println("Enter a number");
		input = Integer.parseInt(reader.nextLine());
		sum = sum + input;
		
		System.out.println("Your total sum is " + sum);
		


}
}
