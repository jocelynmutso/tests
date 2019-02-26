package com.blobtest3;

public class StarsWhiteSpaces {

	public static void printTriangle(int rows) {
		int spaces = 0;
		int stars = - 1;
		while (spaces++ < rows) {
			stars = stars+2;
			w(rows - spaces);
			s(stars);
			
			System.out.println();
		}
		
	}

	public static void w(int size) {
		int i = 0;

		while (i < size) {
			i++;
			System.out.print(" ");
		}
	}

	public static void s(int amount) {
		int i = 0;

		while (i < amount) {
			i++;
			System.out.print("*");
		}
		

	}

	public static void main(String[] args) {
		printTriangle(4);
	}
}
