package com.blobtestArray;

import java.util.ArrayList;

public class ArrayListGreatestInteger {

  public static int greatest(ArrayList<Integer> list) {
    
    int result = 0;

    for (int number : list) {
      if (result < number) {
        result = number;
      }
    }
    return result;
    
    
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The greatest number is: " + greatest(list));
  }

}
