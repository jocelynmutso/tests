package com.blobtestString;

import java.util.Scanner;

public class ReversingAName {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = reader.nextLine();
		int counter = name.length()-1;
		
		while (counter > -1) {
			System.out.print(name.charAt(counter--));
		}
		

	}

}
