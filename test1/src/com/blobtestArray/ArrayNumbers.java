package com.blobtestArray;
import java.util.*;

public class ArrayNumbers {
	
	
	
	public static void main (String [] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		numbers.remove(Integer.valueOf(4));
		for (Integer number : numbers) {
			System.out.println(number);
		}
				
	}

}
