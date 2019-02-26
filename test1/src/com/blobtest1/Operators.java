package com.blobtest1;

public class Operators {
	
	public static void main (String [] args) {
		int number = 3;
		
		System.out.println("Is the number between 5 and 10?");
		
		if (number > 5 && number < 11) {
			System.out.println("The number is " + number + " and yes, it is!");
		}
		
		else {
			System.out.println("The number is " + number + " and nope, it's not!");
		}
	}

}
