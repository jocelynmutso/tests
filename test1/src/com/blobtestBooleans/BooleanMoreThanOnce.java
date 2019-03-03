package com.blobtestBooleans;

import java.util.ArrayList;
import java.util.Scanner;

public class BooleanMoreThanOnce {

  public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
    for (Integer input : list) {
      if (list.contains(number)) {
        return true;
      }
    }
    return false;

  }

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>();

    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("Type a number");
    int number = Integer.parseInt(reader.nextLine());

    if (moreThanOnce(list, number)) {
      System.out.println(number + " appears more than once");
    } else {
      System.out.println(number + " does not appear more than once");
    }

  }

}
