package com.blobtest4;

public class MethodsTest {
	
	public static void main (String [] args) {
		
		int number = 1;
		System.out.println("Main program variable holds the value of " + number);
		addThree(number);
		System.out.println("Main program variable holds the value of " +  number);
		
}

	public static void addThree(int number) {
		System.out.println("Method parametor holds the value of " + number);
		number = number + 3;
		System.out.println("Method parameter holds the value of " + number);
	}
}