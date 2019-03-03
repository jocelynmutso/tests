package com.blobtestBooleans;

import java.util.ArrayList;

public class Boolean {


  public static boolean allPositive(ArrayList<Integer> numbers) {
    boolean noNegative = true;

    for (int number : numbers) {
      if (number < 0) {
        noNegative = false;
      }
    }
    
    return noNegative;

  }


   
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(3);
    numbers.add(2);
    numbers.add(5);

    boolean result = allPositive(numbers);
    if (result) {
      System.out.println("All numbers are positive");
    } else {
      System.out.print("There is at least one negative number");
    }

  }

}