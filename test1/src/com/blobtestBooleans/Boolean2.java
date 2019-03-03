package com.blobtestBooleans;

import java.util.ArrayList;

public class Boolean2 {

  public static boolean allPositive(ArrayList<Integer> numbers) {

    for (int number : numbers) {
      if (number < 0) {
        return false;
      } else {

      }
    }
    return true;
  }

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(3);
    numbers.add(-1);
    numbers.add(5);

    boolean result = allPositive(numbers);
    if (result) {
      System.out.println("All numbers are positive");
    } else {
      System.out.print("There is at least one negative number");
    }

  }

}