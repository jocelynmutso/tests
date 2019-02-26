package com.blobtest3;

public class MethodsStars {

	public static void printRectangle(int width, int height) {
		int i = 0;
		while (i++ < height) {
			printStars(width);
		}

	}

	public static void printTriangle(int size) {
		int i = 0;
		while (i < size) {
			i++;
			printStars(i);
		}
	}

	public static void printStars(int amount) {
		int i = 0;

		while (i < amount) {
			i++;
			System.out.print("*");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		printTriangle(4);

	}

}
