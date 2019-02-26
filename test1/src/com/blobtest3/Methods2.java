package com.blobtest3;
import java.util.Scanner;

public class Methods2 {

	public static void greet(String name) {
		System.out.println("Greetings, " + name);
		
	}
	
	
	public static void greetManyTimes(String name, int times) {
		int i = 0;
		while (i < times) {
			greet(name);
			i++;
		}
	}
	
	public static void main (String [] args) {
		greetManyTimes("Anthony", 3);
		System.out.println("and");
		greetManyTimes("Jim" , 5);
	}
	
	
	

}