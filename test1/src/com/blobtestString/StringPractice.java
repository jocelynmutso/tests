package com.blobtestString;

public class StringPractice {
	

	
	
	
	public static void main (String [] args) {
		String animal = "Dog";
		
		if (animal.equals("Dog")) {
			System.out.println(animal + " says bow-wow");
		} else if (animal.equals("Cat")) {
			System.out.println(animal + "says meow");
		}

		String banana = "Banana";
		String cucumber = "Cucumber";
		String together = banana + cucumber;
		
		System.out.println("The length of banana is " + banana.length());
		System.out.println("The length of cucumber is " + cucumber.length());
		System.out.println("The length of together is " + together.length());
		
		String word = "Supercalifragilisticexpialidocious";
		char character = word.charAt(3);
		System.out.println("The fourth character of the word is " + character);
	}

}
