package com.blobtest1;

public class MathOperations {
	public static void main(String[] args) {
		int age = 1;

		System.out.println(age);

		/*age = age + 1;*/
	
		

		System.out.println(add(1, ++age));
		
		System.out.println(age);

	}
	
	public static int add (int a, int b) {
		return a + b;
	}
}
