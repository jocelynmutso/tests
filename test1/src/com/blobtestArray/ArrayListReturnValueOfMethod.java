package com.blobtestArray;

import java.util.ArrayList;

public class ArrayListReturnValueOfMethod {

  public static ArrayList<Integer> addNumbersToList(int num1, int num2, int num3) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(num1);
    list.add(num2);
    list.add(num3);

    return list;
  }

  public static void main(String[] args) {

    ArrayList<Integer> numbers = addNumbersToList(3, 5, 2);

    for (int number : numbers) {
      System.out.println(number);
    }

  }

}
